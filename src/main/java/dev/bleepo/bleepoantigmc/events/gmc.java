package dev.bleepo.bleepoantigmc.events;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class gmc implements Listener {

    @EventHandler
    public void onGamemodeSwitch(PlayerGameModeChangeEvent e) {
        if (!e.getPlayer().isOp()) {
            e.getPlayer().setGameMode(GameMode.SURVIVAL);
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[&bBleepo&3.dev&6] How did you even get gmc? Anyway, here's survival back :D"));
        }
    }
}
