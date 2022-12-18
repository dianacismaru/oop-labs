package lab10.task1;

import lab10.task1.factory.StepCountStrategyFactory;
import lab10.task1.observer.ConsoleLogger;
import lab10.task1.observer.DataAggregator;
import lab10.task1.observer.ServerCommunicationController;
import lab10.task1.strategy.BasicStepCountStrategy;
import lab10.task1.strategy.StepCountStrategy;

import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();

        long baseTimestamp = 10000;

        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch (taskNum) {
            case 1:
                dataRepository.attach(new ConsoleLogger());
                dataRepository.attach(new ServerCommunicationController());
                break;
            case 2:
                String first_strategy_type = scanner.next();
                String second_strategy_type = scanner.next();

                StepCountStrategy firstStrategy = StepCountStrategyFactory
                                                  .createStepCountStrategy(first_strategy_type, dataRepository);
                StepCountStrategy secondStrategy = StepCountStrategyFactory
                                                  .createStepCountStrategy(second_strategy_type, dataRepository);

                dataRepository.attach(new DataAggregator(secondStrategy));
                dataRepository.attach(new DataAggregator(firstStrategy));
                break;
        }

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();

        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();
    }
}
