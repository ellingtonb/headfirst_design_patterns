package Objects;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Média/Máxima/Minima: " + (this.tempSum / this.numReadings) +
                "/" + this.maxTemp + "/" + this.minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.tempSum += temperature;
        this.numReadings++;

        if (temperature > this.maxTemp) {
            this.maxTemp = temperature;
        }

        if (temperature < this.minTemp) {
            this.minTemp = temperature;
        }
        display();
    }
}
