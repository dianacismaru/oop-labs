package task2;

import java.util.EnumSet;

public final class ConsoleLogger extends LoggerBase {
    public ConsoleLogger() {
        super(EnumSet.allOf(LogLevel.class));
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Console] " + message);
    }
}
