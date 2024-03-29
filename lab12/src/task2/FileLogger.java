package task2;

import java.util.EnumSet;

public final class FileLogger extends LoggerBase {
    public FileLogger() {
        super(EnumSet.of(LogLevel.Warning, LogLevel.Error));
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[File] " + message);
    }
}
