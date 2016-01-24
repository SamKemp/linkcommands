package pw.untamemadman.plugins.linkcommands;

import org.bukkit.plugin.java.JavaPlugin;
import pw.untamemadman.plugins.linkcommands.commands.*;

/**
 * Created by untamemadman on 22/01/2016.
 */
public class LinkCommands extends JavaPlugin
{
    String path = "links.";
    public static String prefix;
    public static String tickets;
    public static String website;
    public static String store;
    public static String youtube;
    public static String twitter;

    @Override
    public void onEnable()
    {
        prefix = getConfig().getString(path + "prefix");
        website = getConfig().getString(path + "website");
        tickets = getConfig().getString(path + "tickets");
        store = getConfig().getString(path + "store");
        youtube = getConfig().getString(path + "youtube");
        twitter = getConfig().getString(path + "twitter");


        this.getCommand("website").setExecutor(new website (this));
        this.getCommand("tickets").setExecutor(new tickets (this));
        this.getCommand("store").setExecutor(new store (this));
        this.getCommand("youtube").setExecutor(new youtube (this));
        this.getCommand("twitter").setExecutor(new twitter (this));
    }

    public void loadConfig()
    {
        loadConfigDefaults();
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void loadConfigDefaults()
    {
        getConfig().set(path + "prefix", "&7[&aMultiCubeUk&7]&b ");
        getConfig().set(path + "website", "Website URL");
        getConfig().set(path + "tickets", "Tickets URL");
        getConfig().set(path + "store", "Webstore URL");
        getConfig().set(path + "youtube", "YouTube URL");
        getConfig().set(path + "twitter", "Twitter URL");
    }
}
