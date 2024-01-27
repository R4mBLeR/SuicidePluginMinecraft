package org.example.r4mblesplugins.suicideplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.example.r4mblesplugins.suicideplugin.SuicidePlugin;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractCommand implements CommandExecutor {
    public AbstractCommand(String command) {
        PluginCommand PluginCommand = SuicidePlugin.GetInstance().getCommand(command);
        if (PluginCommand != null) {
            PluginCommand.setExecutor(this);
        }

    }

    public abstract void execute(CommandSender sender, String label, String[] args);

    @Override
    public boolean onCommand(@Nullable CommandSender sender, @Nullable Command command, @Nullable String label, String[] args) {
        execute(sender, label, args);
        return true;
    }
}

