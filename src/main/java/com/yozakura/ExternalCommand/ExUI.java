package com.yozakura.ExternalCommand;

import net.minecraft.server.MinecraftServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExUI extends JFrame{



    public static void main(String[] args,MinecraftServer server) {
        JFrame jFrame = new JFrame("External Command");

        JPanel jPanel = new JPanel();

        jFrame.setSize(600,400);

        jPanel.setLayout(new GridLayout(4,4,5,5));

        JTextArea sourceCommand = new JTextArea();
        JButton runCommand = new JButton("Run");

        jPanel.add(sourceCommand);
        jPanel.add(runCommand);

        jFrame.add(jPanel);

        jFrame.setVisible(true);


        runCommand.addActionListener((ActionListener) (e) -> {
            if(sourceCommand.getText().length() ==0){
                JOptionPane.showMessageDialog(jPanel, "Command cannot be empty", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else {
                ExRun.run(sourceCommand.getText(),server);
                sourceCommand.setText("");
            }
        });
    }
}
