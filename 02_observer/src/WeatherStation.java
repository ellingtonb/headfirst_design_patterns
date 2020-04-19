import Objects.CurrentConditionsDisplay;
import Objects.ForecastDisplay;
import Objects.StatisticsDisplay;
import Objects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("\nPrimeira Atualização:");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\nSegunda Atualização:");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\nTerceira Atualização:");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
