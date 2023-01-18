package lab10.task3.commands;

/**
 * Interface for the commands used to create the diagram.
 *
 * The commands are applied on the DiagramCanvas and DiagramComponents.
 */
public interface DrawCommand {
    void execute();
}
