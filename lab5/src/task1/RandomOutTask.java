package task1;

import java.util.Random;

public class RandomOutTask implements Task {
    private int randomNumber;
    private static Random random = new Random(12345);

    @Override
    public void execute() {
        System.out.println(randomNumber);
    }

    public RandomOutTask() {
        randomNumber = random.nextInt();
    }
}
