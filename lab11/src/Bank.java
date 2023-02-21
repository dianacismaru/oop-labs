import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Bank {
    private final Set<Business> clients = new HashSet<>();

    public void addClient(final Business client) throws ExistsException {
        if (clients.contains(client)) {
            throw new ExistsException("Client already exists into the bank");
        }

        clients.add(client);
    }

    public Set<Business> getClients() {
        return Collections.unmodifiableSet(clients);
    }
}
