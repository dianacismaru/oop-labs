package lab10.task1.observer;

import lab10.task1.SensorData;
import lab10.task1.strategy.StepCountStrategy;

public class DataAggregator implements Observer {
    private final StepCountStrategy stepCountStrategy;

    public DataAggregator(StepCountStrategy stepCountStrategy) {
        this.stepCountStrategy = stepCountStrategy;
    }

    @Override
    public void update(SensorData dataRecord) {
        System.out.println(stepCountStrategy.getStrategyDescription());
    }
}
