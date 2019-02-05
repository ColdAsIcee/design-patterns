package observer_WeatherData.standard;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasuremenets(80, 65, 30.4f);
        weatherData.setMeasuremenets(82, 70, 29.2f);
        weatherData.setMeasuremenets(78, 90, 29.2f);
    }

}