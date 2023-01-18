package lab10.task1.observer;

import lab10.task1.SensorData;
import lab10.task1.Utils;

public class ServerCommunicationController implements Observer {
    @Override
    public void update(SensorData dataRecord) {
        ServerMessage serverMessage = new ServerMessage(dataRecord.getStepsCount(),
                                    Utils.getClientId(), dataRecord.getTimestamp());
        System.out.println("Generated server message: " + serverMessage);
    }
}
