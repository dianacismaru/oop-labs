package lab10.task3.main;

import lab10.task3.diagram.DiagramCanvas;
import lab10.task3.commands.*;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public final class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        diagramCanvas.show();
    }

    public void newDiagram() {
        diagramCanvas = new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        try {
            return switch (type) {
                case DRAW_RECTANGLE -> new DrawRectangleCommand(diagramCanvas);
                case RESIZE -> new ResizeCommand(diagramCanvas, Integer.parseInt(args[0]), Double.parseDouble(args[1]));
                case CONNECT -> new ConnectComponentsCommand(diagramCanvas, args[0], args[1]);
                case CHANGE_TEXT -> new ChangeTextCommand(diagramCanvas, Integer.parseInt(args[0]), args[1]);
                case CHANGE_COLOR -> new ChangeColorCommand(diagramCanvas, Integer.parseInt(args[0]), args[1]);
            };
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException();
        }
    }
}
