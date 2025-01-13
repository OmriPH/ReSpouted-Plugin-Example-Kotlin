package com.example

import org.bukkit.block.BlockFace
import org.getspout.spoutapi.block.SpoutBlock
import org.getspout.spoutapi.inventory.SpoutItemStack
import org.getspout.spoutapi.material.item.GenericCustomItem
import org.getspout.spoutapi.player.SpoutPlayer

// GenericCustomItem is the class to extend for a custom item
// Plugin instance, Item ID, url to PNG texture
class ExampleItem : GenericCustomItem(Main.get(), "exampleitem", "https://i.ibb.co/sCFvQBD/q6wBozz.png") {
    init {
        name = "Example Item" // Set item name
        // setStackable(false); // Makes item not stackable
    }

    // Run code when the item is interacted with!
    override fun onItemInteract(player: SpoutPlayer, block: SpoutBlock?, face: BlockFace?): Boolean {
        if (!player.isSpoutCraftEnabled) return false // Only interact if Spout player (Spout can allow vanilla clients to join)


        player.inventory.addItem(SpoutItemStack(Main.get().exampleItem)) // Give player a Spout item

        return true
    }
}
