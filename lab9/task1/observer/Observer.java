package lab10.task1.observer;

import lab10.task1.SensorData;

public interface Observer {
    void update(SensorData dataRecord);
}
