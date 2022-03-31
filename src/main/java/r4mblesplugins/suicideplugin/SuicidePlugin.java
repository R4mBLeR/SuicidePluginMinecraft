package r4mblesplugins.suicideplugin;

import org.bukkit.plugin.java.JavaPlugin;
import r4mblesplugins.suicideplugin.commands.suicide;

public final class SuicidePlugin extends JavaPlugin {

    private static SuicidePlugin instance;


    @Override
    public void onEnable() {
        instance = this;
        new suicide();
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }

    public static SuicidePlugin GetInstance() {
        return instance;
    }
}
