package xyz.cyto.enchantSystem;

import org.bukkit.plugin.java.JavaPlugin;

import xyz.cyto.enchantSystem.listeners.InvClick;
import xyz.cyto.enchantSystem.listeners.OpenEnchant;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new OpenEnchant(), this);
		getServer().getPluginManager().registerEvents(new InvClick(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
