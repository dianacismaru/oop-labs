package lab10.task3.main;

import java.util.Scanner;

public final class Test {
    private static String spacerSymbols = new String(new char[40]).replace("\0", "-");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        Client client = new Client();

        switch(taskNum) {
            case 1:
                printOutputSpacerFor("testDraw");
                testDraw(client);

                printOutputSpacerFor("testTextAndColor");
                testTextAndColor(client);

                printOutputSpacerFor("testResize");
                testResize(client);

                printOutputSpacerFor("testConnect");
                testConnect(client);

                printOutputSpacerFor("testAllCommands");
                testAllCommands(client);

                break;
            default:
                System.out.println("Part 2 is not implemented");
        }

    }

    private static void printOutputSpacerFor(String test) {
        System.out.println(spacerSymbols + test + spacerSymbols);
    }

    private static void testDraw(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");

        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");
        client.showDiagram();
    }

    private static void testConnect(Client client) {
        testDraw(client);
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "3", "2");
        client.executeAction("connect", "1", "4");
        client.executeAction("draw rectangle");
        client.showDiagram();
    }

    private static void testResize(Client client) {
        testDraw(client);
        client.executeAction("resize", "0", "10");
        client.executeAction("resize", "2", "50");
        client.executeAction("resize", "4", "25");
        client.showDiagram();
    }

    private static void testAllCommands(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("resize", "0", "10");
        client.executeAction("change color", "2", "PINK");
        client.executeAction("connect", "2", "1");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "1", "Class1");
        client.executeAction("change text", "3", "Class2");

        client.showDiagram();
    }
}
