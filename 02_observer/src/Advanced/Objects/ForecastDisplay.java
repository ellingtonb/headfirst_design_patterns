package Advanced.Objects;

import Advanced.Interfaces.DisplayElement;
import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

public class ForecastDisplay extends AbstractObserver implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Subject subject) {
        super(subject);
    }

    @Override
    public String getName() {
        return "ForecastDisplay";
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
