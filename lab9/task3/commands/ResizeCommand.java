package lab10.task3.commands;

import lab10.task3.diagram.DiagramCanvas;
import lab10.task3.diagram.DiagramComponent;

public final class ResizeCommand implements DrawCommand {
    private final DiagramCanvas diagramCanvas;
    private final double percent;
    private final int index;

    public ResizeCommand(DiagramCanvas diagramCanvas, int index, double percent) {
        this.diagramCanvas = diagramCanvas;
        this.percent = percent;
        this.index = index;
    }

    @Override
    public void execute() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(index);
        diagramComponent.setHeight((int) (diagramComponent.getHeight() * (percent / 100)));
        diagramComponent.setWeight((int) (diagramComponent.getWeight() * (percent / 100)));
    }
}
