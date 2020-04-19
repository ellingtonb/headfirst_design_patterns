package Advanced.Objects;

import Advanced.Interfaces.DisplayElement;
import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Média/Máxima/Minima: " + (this.tempSum / this.numReadings) +
                "/" + this.maxTemp + "/" + this.minTemp);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;

            float weatherTemp = weatherData.getTemperature();

            this.tempSum += weatherTemp;
            this.numReadings++;

            if (weatherTemp > this.maxTemp) {
                this.maxTemp = weatherTemp;
            }

            if (weatherTemp < this.minTemp) {
                this.minTemp = weatherTemp;
            }
            display();
        }
    }
}
