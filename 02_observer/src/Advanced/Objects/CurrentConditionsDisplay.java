package Advanced.Objects;

import Advanced.Interfaces.DisplayElement;
import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Condições Atuais: " + this.temperature +
                "F degrees and " + this.humidity + "% humidity.");
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
