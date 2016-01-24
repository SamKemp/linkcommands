package pw.untamemadman.plugins.linkcommands;

import org.bukkit.plugin.java.JavaPlugin;
import pw.untamemadman.plugins.linkcommands.commands.*;

/**
 * Created by untamemadman on 22/01/2016.
 */
public class LinkCommands extends JavaPlugin
{
    public static String prefix = "&7[&aMultiCubeUk&7]&b ";
    public static String tickets = "http://www.multicube.co/supporttickets";
    public static String website = "http://www.multicube.co";
    public static String store = "http://store.multicube.co";
    public static String youtube = "https://www.youtube.com/channel/UC9DCt6T-CpbhKqLjk6fudRA";
    public static String twitter = "https://twitter.com/MultiCubeUk";

    @Override
    public void onEnable()
    {
        this.getCommand("tickets").setExecutor(new tickets (this));
        this.getCommand("website").setExecutor(new website (this));
        this.getCommand("store").setExecutor(new store (this));
        this.getCommand("youtube").setExecutor(new youtube (this));
        this.getCommand("twitter").setExecutor(new twitter (this));
    }
}
