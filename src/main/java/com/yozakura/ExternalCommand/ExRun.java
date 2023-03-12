package com.yozakura.ExternalCommand;

import net.minecraft.server.MinecraftServer;

public class ExRun {
    public static void run(String args,MinecraftServer server){
        server.commandManager.executeCommand(server,args);
    }

}
