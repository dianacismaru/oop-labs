package lab10.observer;

public class ConsoleLogger implements Observer {
    @Override
    public void update(SensorData dataRecord) {
        System.out.println("New sensor data: " + dataRecord.toString());
    }
}
