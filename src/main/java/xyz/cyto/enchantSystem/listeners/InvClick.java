package xyz.cyto.enchantSystem.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import xyz.cyto.enchantSystem.inventories.BookInv;
import xyz.cyto.enchantSystem.inventories.EditInv;
import xyz.cyto.enchantSystem.inventories.NewInv;

public class InvClick implements Listener{
	
	NewInv newi = new NewInv();
	EditInv editi = new EditInv();
	BookInv booki = new BookInv();
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		e.getWhoClicked().sendMessage("hi");
		e.getWhoClicked().sendMessage(e.getEventName());
		
		if(e.getClickedInventory() != null) {
			//Main Inv
			if(e.getClickedInventory().equals(NewInv.inv)) {
				if(e.getRawSlot() == 26) {
					e.setCancelled(true);
					//e.getWhoClicked().sendMessage("test");
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openEnchanting(e.getWhoClicked().getTargetBlock(10).getLocation(), false);
					return;
				}
				if(e.getRawSlot() == 11) {
					e.setCancelled(true);
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openInventory(editi.NewInventory());
					return;
				}
				if(e.getRawSlot() == 12) {
					e.setCancelled(true);
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openInventory(booki.NewInventory());
					return;
				}
				e.setCancelled(true);
				return;
			}
			
			
			
			//ItemEditInv
			if(e.getClickedInventory().equals(EditInv.inv)) {
				if(e.getRawSlot() == 36) {
					e.setCancelled(true);
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openInventory(newi.NewInventory());
					return;
				}
				if(e.getRawSlot() == 19) {
					return;
				}
				e.setCancelled(true);
				return;
			}
			
			
			
			
			//Combine Book inv
			if(e.getClickedInventory().equals(BookInv.inv)) {
				if(e.getRawSlot() == 18) {
					e.setCancelled(true);
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openInventory(newi.NewInventory());
					return;
				}
				e.setCancelled(true);
				return;
			}
		}
		
	}
}