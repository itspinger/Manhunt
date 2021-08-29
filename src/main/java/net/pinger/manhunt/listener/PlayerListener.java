package net.pinger.manhunt.listener;

import net.pinger.manhunt.Manhunt;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import java.util.UUID;

public class PlayerListener implements Listener {

    private final Manhunt manhunt;

    public PlayerListener(Manhunt manhunt) {
        this.manhunt = manhunt;
    }

    @EventHandler
    public void onJoin(AsyncPlayerPreLoginEvent event) {
        UUID id = event.getUniqueId();

        // Check if the user is allowed first
        // The only time they will be disallowed to join is while the server is restarting

        // Create a new user if it's first time joining
        this.manhunt.getUserManager().createUser(id);
    }

}
