package net.scoin0.cls;

import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.plugin.Plugin;

public class CLS extends Plugin{
	
	public static String Plugin_Name = "CLS ";
	public static String Plugin_Version = "1.0.2 ";
	public static String Plugin_Author = "Scoin0 ";
	
	public boolean enable() {
		getLogman().info(Plugin_Name + Plugin_Version + "created by " + Plugin_Author + "has been enabled!");
		
		try{Canary.commands().registerCommands(new CLSCommandList(), this, false);}
        catch(CommandDependencyException e){getLogman().error("Error with Command: ", e);}
		
		return true;
	}

	public void disable() {
		getLogman().info(Plugin_Name + "has been Disabled!");
	}
}