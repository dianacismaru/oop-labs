package lab10.task1;

import lab10.task1.observer.Observer;
import lab10.task1.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public final class DataRepository implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final List<SensorData> sensorDataList = new ArrayList<>();

    public void addData(SensorData dataRecord) {
        sensorDataList.add(dataRecord);
        notifyObservers(dataRecord);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(SensorData dataRecord) {
        for (Observer observer: observers) {
            observer.update(dataRecord);
        }
    }

    public List<SensorData> getSensorDataList() {
        return sensorDataList;
    }
}
