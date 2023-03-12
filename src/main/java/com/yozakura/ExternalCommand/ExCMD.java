package com.yozakura.ExternalCommand;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class ExCMD extends CommandBase {
    @Override
    public String getName() {
        return "excmd";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "excmd";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        ExUI.main(args,server);
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
