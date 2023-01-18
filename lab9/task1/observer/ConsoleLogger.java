package lab10.task1.observer;

import lab10.task1.SensorData;

public class ConsoleLogger implements Observer {
    @Override
    public void update(SensorData dataRecord) {
        System.out.println("New sensor data: " + dataRecord.toString());
    }
}
