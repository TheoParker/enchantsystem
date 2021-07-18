package xyz.cyto.enchantSystem.inventories;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EditInv {
	
public static Inventory inv;
	
	public Inventory NewInventory() {
		
		inv = Bukkit.createInventory(null, 45, "Edit Enchants");
		
		initializeItems();
		
		return inv;
	}
	
	public void initializeItems() {
		
		ItemStack blank = createGuiItem(Material.BLACK_STAINED_GLASS_PANE, " "); 
		
		
		for(int i = 0; i < 45; i++) {
			inv.setItem(i, blank);
		}
		
		inv.clear(19);
		
		inv.setItem(36, createGuiItem(Material.ARROW, "Back"));
		
	}
	
	protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
		
		final ItemStack item = new ItemStack(material, 1);
		final ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(name);
		
		meta.setLore(Arrays.asList(lore));
		
		item.setItemMeta(meta);
		
		return item;
	}
}
