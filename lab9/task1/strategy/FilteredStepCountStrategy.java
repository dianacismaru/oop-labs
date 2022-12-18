package lab10.task1.strategy;

import lab10.task1.DataRepository;
import lab10.task1.SensorData;
import lab10.task1.Utils;

public final class FilteredStepCountStrategy implements StepCountStrategy {
    private final DataRepository dataRepository;

    public FilteredStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int stepsCount = 0;
        int prevStepCount = 0;

        for (SensorData sensorData: dataRepository.getSensorDataList()) {
            int currentStepCount = sensorData.getStepsCount();

            if (currentStepCount > 0 && currentStepCount < prevStepCount + Utils.MAX_STEP_DIFFERENCE) {
                stepsCount += currentStepCount;
            }
            prevStepCount = currentStepCount;
        }

        return stepsCount;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered strategy, total step count: : " + getTotalSteps();
    }
}
