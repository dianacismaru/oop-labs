package task1;

public class CounterOutTask implements Task {
    private static int counter;

    @Override
    public void execute() {
        System.out.println(++counter);
    }
}
