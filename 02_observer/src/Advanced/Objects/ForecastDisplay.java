package Advanced.Objects;

import Advanced.Interfaces.DisplayElement;
import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Previsão: ");
        if (currentPressure > lastPressure) {
            System.out.println("O Clima está melhorando.");
        } else if (currentPressure == lastPressure) {
            System.out.println("O Clima continua o mesmo.");
        } else if (currentPressure < lastPressure) {
            System.out.println("Clima frio e chuvoso.");
        }
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }
}
