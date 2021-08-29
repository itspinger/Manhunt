package net.pinger.manhunt.manager;

import net.pinger.manhunt.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserManager {

    private final Map<UUID, User> users = new HashMap<>();

    /**
     * Creates a new user from a specified id if the user does not exist.
     *
     * @param id the id of the user
     */

    public void createUser(UUID id) {
        this.users.putIfAbsent(id, new User(id));
    }

    /**
     * Returns a user from a specified player uuid.
     * <p>
     * This method is nullable, if the specified player has not
     * logged into the server since the restart.
     *
     * @param id the id of the user
     * @return the user
     */

    public User getUser(UUID id) {
        return this.users.get(id);
    }

}
