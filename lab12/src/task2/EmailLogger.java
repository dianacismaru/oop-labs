package task2;

import java.util.EnumSet;

public final class EmailLogger extends LoggerBase {
    public EmailLogger() {
        super(EnumSet.of(LogLevel.FunctionalMessage, LogLevel.FunctionalError));
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[Email] " + message);
    }
}
