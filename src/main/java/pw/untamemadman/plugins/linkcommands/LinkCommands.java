package pw.untamemadman.plugins.linkcommands;

import org.bukkit.plugin.java.JavaPlugin;
import pw.untamemadman.plugins.linkcommands.commands.*;

import java.io.Console;

/**
 * Created by untamemadman on 22/01/2016.
 */
public class LinkCommands extends JavaPlugin
{
    public static String prefix = "&7[&aMultiCubeUk&7]&b";
    public static String tickets = "http://www.multicube.co/supporttickets";
    public static String website = "http://www.multicube.co";
    public static String store = "http://store.multicube.co";
    public static String youtube = "https://www.youtube.com/channel/UC9DCt6T-CpbhKqLjk6fudRA";
    public static String twitter = "http://www.twitter.com/multicubeuk";

    @Override
    public void onEnable()
    {
        //loadConfig();

        /*
        prefix = getConfig().getString("links.prefix");
        website = getConfig().getString("links.website");
        tickets = getConfig().getString("links.tickets");
        store = getConfig().getString("links.store");
        youtube = getConfig().getString("links.youtube");
        twitter = getConfig().getString("links.twitter");
        */

        //Command registry
        this.getCommand("website").setExecutor(new website(this));
        this.getCommand("tickets").setExecutor(new tickets(this));
        this.getCommand("store").setExecutor(new store(this));
        this.getCommand("youtube").setExecutor(new youtube(this));
        this.getCommand("twitter").setExecutor(new twitter(this));
    }

    public void loadConfig()
    {
        //loadConfigDefaults();
        //getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public void loadConfigDefaults()
    {
        String path = "links.";

        getConfig().set(path + "prefix", "&7[&aMultiCubeUk&7]&b ");
        getConfig().set(path + "website", "Website URL");
        getConfig().set(path + "tickets", "Tickets URL");
        getConfig().set(path + "store", "Webstore URL");
        getConfig().set(path + "youtube", "YouTube URL");
        getConfig().set(path + "twitter", "Twitter URL");
    }
}
