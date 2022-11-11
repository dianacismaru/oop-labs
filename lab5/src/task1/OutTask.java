package task1;

public final class OutTask implements Task {
    private final String message;

    @Override
    public void execute() {
        System.out.println(message);
    }

    public OutTask(String message) {
        this.message = message;
    }
}
