package xyz.cyto.enchantSystem.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import xyz.cyto.enchantSystem.inventories.NewInv;

public class OpenEnchant implements Listener{
	
	NewInv i = new NewInv();
	
	@EventHandler
	public void onOpen(PlayerInteractEvent e) {
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && e.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE)) {
			Player p = e.getPlayer();
			e.setCancelled(true);
			p.openInventory(i.NewInventory());
		}
	}
}