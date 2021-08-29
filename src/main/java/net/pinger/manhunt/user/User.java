package net.pinger.manhunt.user;

import java.util.UUID;

public class User {

    // The uuid of this user
    private final UUID id;

    // By default, all players are hunters until we choose the runner
    private boolean hunter = true;

    public User(UUID id) {
        this.id = id;
    }

    /**
     * This method sets this user as the speed runner
     */

    public void setSpeedRunner() {
        this.hunter = false;
    }

    public boolean isHunter() {
        return hunter;
    }

    public UUID getId() {
        return id;
    }
}
