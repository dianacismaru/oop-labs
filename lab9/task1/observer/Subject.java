package lab10.task1.observer;

import lab10.task1.SensorData;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(SensorData dataRecord);
}
