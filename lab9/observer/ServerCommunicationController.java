package lab10.observer;

public class ServerCommunicationController implements Observer {
    @Override
    public void update(SensorData dataRecord) {
        ServerMessage serverMessage = new ServerMessage(dataRecord.getStepsCount(),
                                    Utils.getClientId(), dataRecord.getTimestamp());
        System.out.println("Generated server message: " + serverMessage);
    }
}
