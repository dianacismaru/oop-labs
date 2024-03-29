package lab10.task1.observer;

// Message sent by the ServerCommunicationController
public class ServerMessage {
    private int steps;
    private int clientid;
    private long timestamp;

    ServerMessage(int steps, int clientid, long timestamp) {
        this.steps = steps;
        this.clientid = clientid;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                "steps=" + steps +
                ", clientid=" + clientid +
                ", timestamp=" + timestamp +
                '}';
    }
}
