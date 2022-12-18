package lab10.task1.factory;

import lab10.task1.DataRepository;
import lab10.task1.strategy.BasicStepCountStrategy;
import lab10.task1.strategy.FilteredStepCountStrategy;
import lab10.task1.strategy.StepCountStrategy;

public class StepCountStrategyFactory {
    public static StepCountStrategy createStepCountStrategy(String stepCountStrategyType,
                                                            DataRepository dataRepository) {
        switch (stepCountStrategyType) {
            case "basic" -> {
                return new BasicStepCountStrategy(dataRepository);
            }
            case "filtered" -> {
                return new FilteredStepCountStrategy(dataRepository);
            }
        }
        throw new IllegalArgumentException("Invalid stepCountStrategyType");
    }
}
