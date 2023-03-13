package com.yozakura.ExternalCommand;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod(modid = ExMod.MODID, name = ExMod.NAME, version = ExMod.VERSION)
public class ExMod
{
    public static final String MODID = "external_command";
    public static final String NAME = "External Command";
    public static final String VERSION = "1.0.0";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }


    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new ExCMD());
        logger.info("Excmd -command was registered");
    }
}
