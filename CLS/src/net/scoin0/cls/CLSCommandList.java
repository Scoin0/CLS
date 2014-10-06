package net.scoin0.cls;

import net.canarymod.Canary;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class CLSCommandList implements CommandListener {
	
	@Command
	(aliases = { "cls" },
	description = "Clear your chat screen",
	permissions = { "canaryextras.command.cls"},
	toolTip = "/cls")
	
	public void cls(MessageReceiver caller, String [] parameters){
		Player player = (Player)caller;
		int c = 0;
		
		while(c <= 25){
			player.message("");
			c++;
		}
		player.message("§cYour chat screen has been cleared!");
	}
	
	@Command
	(aliases = { "cls" },
	description = "Clear your chat screen",
	permissions = { "canaryextras.command.cls"},
	toolTip = "/cls <player>",
	parent = "cls")
	
	public void clso(MessageReceiver caller, String [] parameters){
		Player player = (Player)caller;
		Player targetPlayer = Canary.getServer().matchPlayer(parameters[1]);
		int c = 0;

		if(targetPlayer == null){
			player.message("§cThe player is not online or doesn't exist.");
			return;
		}
		
		while(c <= 25){
			player.message("");
			c++;
		}
		player.message("§cYour chat screen has been cleared!");
	}
	
	@Command
	(aliases = { "global" },
	description = "Clear the chat screen globaly",
	permissions = { "canaryextras.command.cls"},
	toolTip = "/cls global",
	parent = "cls")
	
	public void gcls(MessageReceiver caller, String [] parameters){
		Player player = (Player)caller;
		int c = 0;
		
		while(c <= 25){
			player.message("");
			c++;
		}
		Canary.getServer().broadcastMessage("§cYour chat screen was cleared by the server!");
	}
}
