package net.pinger.manhunt.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class CountdownTask extends BukkitRunnable {

    // Time in seconds left until the game starts
    private int time = 61;

    @Override
    public void run() {
        --this.time;

        if (this.time == 0) {
            this.cancel();
        }

        if (this.time % 10 == 0 || (this.time < 10)) {
            Bukkit.broadcastMessage(String.valueOf(time));
        }
    }
}
