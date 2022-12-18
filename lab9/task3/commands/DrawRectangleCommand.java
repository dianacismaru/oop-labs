package lab10.task3.commands;

import lab10.task3.diagram.DiagramCanvas;
import lab10.task3.diagram.DiagramComponent;

public final class DrawRectangleCommand implements DrawCommand {
    private final DiagramCanvas diagramCanvas;

    public DrawRectangleCommand(DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        diagramCanvas.addComponent(new DiagramComponent());
    }
}
