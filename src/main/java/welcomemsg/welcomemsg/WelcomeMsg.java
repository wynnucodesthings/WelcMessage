package welcomemsg.welcomemsg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WelcomeMsg extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Wyn's plugin message enabled.");
        Bukkit.getPluginManager().registerEvents(new listener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Thanks for using wyn's welcome message plugin!");
    }
}
