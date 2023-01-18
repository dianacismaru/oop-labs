package lab10.task1.strategy;

import lab10.task1.DataRepository;
import lab10.task1.SensorData;

public final class BasicStepCountStrategy implements StepCountStrategy {
    private final DataRepository dataRepository;

    public BasicStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int stepsCount = 0;

        for (SensorData sensorData: dataRepository.getSensorDataList()) {
            stepsCount += sensorData.getStepsCount();
        }

        return stepsCount;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic strategy, total step count: : " + getTotalSteps();
    }
}
