package org.filnari.makerlore;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Enabling MakerLore");
        getServer().getPluginManager().registerEvents(this, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Disabling MakerLore");
    }

    // I think it's this one. maybe
    // https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/inventory/CraftItemEvent.html
    //
    @EventHandler
    public void CraftDone(InventoryClickEvent event) {
        ItemStack i = event.getCurrentItem();
        Player p = (Player) event.getWhoClicked();
        int slot = event.getSlot();
        ItemStack i2 = new ItemStack(Material.AIR,0);
        if (i.equals(i2)) { return;}

        getLogger().info(p+" clicked "+i+" slot #"+slot);

    }

    /*
    @EventHandler
    public void Craft(CraftItemEvent event) {
        Player player = (Player) event.getWhoClicked();
        String name = player.getName();
        
    }

    @EventHandler
    public void Prepare(PrepareItemCraftEvent event) {
        // Player player = (Player) event.;
        // String name = player.getName();

    }
    */

    // Watch for item craft or enchant

    // case the type of item

    // Build the lore on the item
}