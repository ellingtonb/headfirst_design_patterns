package Advanced.Objects;

import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private float lastTemperatureNotified;
    private float lastHumidityNotified;
    private float lastPressureNotified;
    private boolean changed = false;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            this.observers.add(o);
            return;
        }
        System.out.println("---> ATENÇÃO! Observer '" + o.getName() + "' JÁ Registrado!");
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            this.observers.remove(index);
            return;
        }
        System.out.println("---> ATENÇÃO! Observer '" + o.getName() + "' NÃO Encontra-se Registrado!");
    }

    @Override
    public void notifyObserver() {
        if (this.changed) {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer = (Observer) observers.get(i);
                observer.update(this);
            }
            this.changed = false;
        }
    }

    private void setChanged() {
        this.changed = true;
    }

    public void measurementsChanged() {

        setChanged();

        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        boolean tempNotify = temperature >= this.lastTemperatureNotified + 10 ||
                temperature <= this.lastTemperatureNotified - 10;

        boolean humNotify = humidity >= this.lastHumidityNotified + 10 ||
                humidity <= this.lastHumidityNotified - 10;

        boolean pressNotify = pressure >= this.lastPressureNotified + 10 ||
                pressure <= this.lastPressureNotified - 10;;

        boolean shouldNotify = tempNotify || humNotify || pressNotify;

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        if (shouldNotify) {
            this.lastTemperatureNotified = temperature;
            this.lastHumidityNotified = humidity;
            this.lastPressureNotified = pressure;
            measurementsChanged();
            return;
        }

        System.out.println("---> Nenhuma Informação Precisa ser Atualizada!");
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
