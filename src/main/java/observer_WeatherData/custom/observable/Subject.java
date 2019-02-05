package observer_WeatherData.custom.observable;

import observer_WeatherData.custom.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}