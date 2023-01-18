package lab10.task3.commands;

import lab10.task3.diagram.DiagramCanvas;

public final class ConnectComponentsCommand implements DrawCommand {
    private final DiagramCanvas diagramCanvas;
    private final String firstComponent;
    private final String secondComponent;

    public ConnectComponentsCommand(DiagramCanvas diagramCanvas, String firstComponent, String secondComponent) {
        this.diagramCanvas = diagramCanvas;
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(Integer.parseInt(firstComponent)).connectTo(secondComponent);
        diagramCanvas.getComponent(Integer.parseInt(secondComponent)).connectTo(firstComponent);
    }
}
