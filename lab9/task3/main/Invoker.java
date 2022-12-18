package lab10.task3.main;

import lab10.task3.commands.DrawCommand;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public final class Invoker {
    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        command.execute();
    }
}
