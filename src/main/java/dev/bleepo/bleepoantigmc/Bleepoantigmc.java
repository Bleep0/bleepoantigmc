package dev.bleepo.bleepoantigmc;

import dev.bleepo.bleepoantigmc.events.gmc;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bleepoantigmc extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "Yes its fucking loaded bleepo hold your ass on");
        getServer().getPluginManager().registerEvents(new gmc(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "Finally i can have a break for fuck sake");
    }
}
