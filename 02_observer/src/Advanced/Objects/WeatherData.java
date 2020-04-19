package Advanced.Objects;

import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private boolean changed = false;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            this.observers.remove(index);
        }
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
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
