package org.example.r4mblesplugins.suicideplugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.r4mblesplugins.suicideplugin.commands.SuicideCommand;

public final class SuicidePlugin extends JavaPlugin {

    private static SuicidePlugin instance;
    public static FileConfiguration config;


    @Override
    public void onEnable() {
        instance = this;
        new SuicideCommand();
        config = getConfig();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }

    public static SuicidePlugin GetInstance() {
        return instance;
    }
}
