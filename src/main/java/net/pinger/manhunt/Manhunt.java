package net.pinger.manhunt;

import net.pinger.manhunt.game.Game;
import net.pinger.manhunt.manager.UserManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Manhunt extends JavaPlugin {

    // The instance of the user manager
    private final UserManager userManager = new UserManager();

    // The mahunt game
    private Game game;

    @Override
    public void onEnable() {
        this.game = new Game();
    }

    public UserManager getUserManager() {
        return userManager;
    }
}
