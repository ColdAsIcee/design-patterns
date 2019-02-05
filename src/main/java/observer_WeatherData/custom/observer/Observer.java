package observer_WeatherData.custom.observer;

public interface Observer {

    void update(float temperature, float humidity, float pressure);

}