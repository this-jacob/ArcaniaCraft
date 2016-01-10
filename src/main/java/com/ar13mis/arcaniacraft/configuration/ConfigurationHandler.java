package com.ar13mis.arcaniacraft.configuration;

        import net.minecraftforge.common.config.Configuration;

        import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //load all of the configs
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the config file
            configuration.load();

            //read in properties
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "A generic example config").getBoolean(true);
        }
        catch (Exception e)
        {
            //log exception
        }
        finally
        {
            //save the config file
            configuration.save();
        }
    }
}
