package Objects;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
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
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = currentPressure;
        this.currentPressure = pressure;
        display();
    }
}
