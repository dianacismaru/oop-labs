package lab10.task3.commands;

import lab10.task3.diagram.DiagramCanvas;

public final class ChangeTextCommand implements DrawCommand {
    private final DiagramCanvas diagramCanvas;
    private final String text;
    private final int index;

    public ChangeTextCommand(DiagramCanvas diagramCanvas, int index, String text) {
        this.diagramCanvas = diagramCanvas;
        this.text = text;
        this.index = index;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(index).setText(text);
    }
}
