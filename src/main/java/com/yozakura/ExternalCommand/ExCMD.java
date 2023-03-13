package com.yozakura.ExternalCommand;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import static com.yozakura.ExternalCommand.ExMod.logger;

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
        try {

            ExUI.main(args, server);
            logger.info("ExUI was opened");
        } catch (Exception exception) {
            logger.error("ExUI was error");
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 4;
    }
}
