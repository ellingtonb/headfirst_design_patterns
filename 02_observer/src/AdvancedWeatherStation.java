import Advanced.Objects.*;

public class AdvancedWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        System.out.println("\nObserver AVANÇADO");
        System.out.println("---------------------");
        System.out.println("Primeira Atualização:");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\nSegunda Atualização:");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\nTerceira Atualização:");
        forecastDisplay.stopObserver();
        heatIndexDisplay.stopObserver();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("\nQuarta Atualização:");
        forecastDisplay.startObserver();
        forecastDisplay.startObserver();
        heatIndexDisplay.startObserver();
        currentDisplay.stopObserver();
        statisticsDisplay.stopObserver();
        weatherData.setMeasurements(89, 91, 26.2f);
    }
}
