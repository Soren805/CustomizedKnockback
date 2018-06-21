package fr.soren805.customizedknockback;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.soren805.customizedknockback.listeners.ListenersExec;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("CustomizedKnockback > Enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new ListenersExec(this), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("CustomizedKnockback > Disabled!");
	}

}
