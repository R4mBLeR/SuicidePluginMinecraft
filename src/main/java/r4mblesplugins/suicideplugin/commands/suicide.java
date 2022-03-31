package r4mblesplugins.suicideplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import r4mblesplugins.suicideplugin.SuicidePlugin;

public class suicide extends AbstractCommand {

    public suicide() {
        super("suicide");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        if (!player.hasPermission("SuicidePlugin.suicide")) {
            player.sendMessage(SuicidePlugin.config.getString("messages.noperm-message"));
            return;
        }
        player.setHealth(0.0);
        if (SuicidePlugin.config.getBoolean("allow-messages.suicide-local-message-allow"))
            player.sendMessage(SuicidePlugin.config.getString("messages.suicide-local-message"));
        if (SuicidePlugin.config.getBoolean("allow-messages.suicide-global-message-allow"))
        Bukkit.broadcastMessage(SuicidePlugin.config.getString("messages.suicide-global-message").replace("[player]", player.getName()));

    }
}
