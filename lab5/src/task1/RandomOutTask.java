package task1;

import java.util.Random;

public final class RandomOutTask implements Task {
    private final int randomNumber;
    private static final Random random = new Random(12345);

    @Override
    public void execute() {
        System.out.println(randomNumber);
    }

    public RandomOutTask() {
        randomNumber = random.nextInt();
    }
}
