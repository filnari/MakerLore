package org.filnari.makerlore;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabling MakerLore");
    }
    @Override
    public void onDisable() {
        getLogger().info("Disabling MakerLore");
    }

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
    // Watch for item craft or enchant

    // case the type of item

    // Build the lore on the item
}