package xyz.cyto.enchantSystem.inventories;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BookInv {

	public static Inventory inv;
	
	public Inventory NewInventory() {
		
		inv = Bukkit.createInventory(null, 27, "Combine Books");
		
		initializeItems();
		
		return inv;
	}
	
	public void initializeItems() {
		
		ItemStack blank = createGuiItem(Material.BLACK_STAINED_GLASS_PANE, " "); 
		
		
		for(int i = 0; i < 27; i++) {
			inv.setItem(i, blank);
		}
		
		
		inv.clear(10);
		inv.clear(12);
		inv.setItem(15, createGuiItem(Material.IRON_BARS, "Place Enchanted Books in Slots"));
		inv.setItem(18, createGuiItem(Material.ARROW, "Back"));
		
		
		
		
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
