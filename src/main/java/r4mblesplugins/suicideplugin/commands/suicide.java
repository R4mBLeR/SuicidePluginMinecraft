package r4mblesplugins.suicideplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicide extends AbstractCommand {

    public suicide() {
        super("suicide");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        if (!player.hasPermission("SuicidePlugin.suicide")) {
            player.sendMessage(ChatColor.GREEN + "Вы не можете совершить суицид, видимо, такая у вас судьба");
            return;
        }
        player.setHealth(0.0);
        player.sendMessage(ChatColor.DARK_RED + "Вы совершили суицид");
        Bukkit.broadcastMessage(ChatColor.DARK_RED+"Игрок "+player.getName()+" совершил суицид");

    }
}
