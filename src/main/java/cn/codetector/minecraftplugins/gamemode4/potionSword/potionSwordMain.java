package cn.codetector.minecraftplugins.gamemode4.potionSword;

import org.bukkit.plugin.java.JavaPlugin;

public class potionSwordMain extends JavaPlugin{
    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("Starting potionSword");
        getServer().getPluginManager().registerEvents(new EventListener(),this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Shutting Down potionSword");
    }
}
