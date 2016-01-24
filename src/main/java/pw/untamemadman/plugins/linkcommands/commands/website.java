package pw.untamemadman.plugins.linkcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pw.untamemadman.plugins.linkcommands.LinkCommands;

/**
 * Created by untamemadman on 22/01/2016.
 */
public class website implements CommandExecutor
{
    private final LinkCommands plugin;

    public website(LinkCommands plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("website"))
        {
            if (sender instanceof Player)
            {
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', LinkCommands.prefix + LinkCommands.website));
                return true;
            }
            else
            {
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', LinkCommands.prefix + LinkCommands.website));
                return true;
            }
        }
        return false;
    }
}
