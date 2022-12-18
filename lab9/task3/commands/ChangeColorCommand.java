package lab10.task3.commands;

import lab10.task3.diagram.DiagramCanvas;

public final class ChangeColorCommand implements DrawCommand {
    private final DiagramCanvas diagramCanvas;
    private final String color;
    private final int index;

    public ChangeColorCommand(DiagramCanvas diagramCanvas, int index, String color) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.color = color;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(index).setColor(color);
    }
}
