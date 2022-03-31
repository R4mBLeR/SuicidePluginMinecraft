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
            player.sendMessage(SuicidePlugin.GetInstance().getConfig().getString("messages.noperm-message"));
            return;
        }
        player.setHealth(0.0);
        player.sendMessage(SuicidePlugin.GetInstance().getConfig().getString("messages.suicide-local-message"));

        Bukkit.broadcastMessage(SuicidePlugin.GetInstance().getConfig().getString("messages.suicide-global-message").replace("[player]", player.getName()));

    }
}
