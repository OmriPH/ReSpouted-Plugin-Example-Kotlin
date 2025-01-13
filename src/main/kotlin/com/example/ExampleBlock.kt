package com.example

import org.bukkit.World
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign
import org.getspout.spoutapi.inventory.SpoutItemStack
import org.getspout.spoutapi.material.block.GenericCustomBlock
import org.getspout.spoutapi.player.SpoutPlayer

// Plugin instance, Block ID, is opaque
// GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
class ExampleBlock : GenericCustomBlock(Main.get(), "exampleblock", true, GenericCubeBlockDesign(Main.get(), "https://i.ibb.co/YWs9T00/sugar-cane-block.png", 16)) {
    init {
        name = "Example Block" // Set block name
    }

    override fun onBlockInteract(world: World, x: Int, y: Int, z: Int, player: SpoutPlayer): Boolean {
        if (!player.isSpoutCraftEnabled) return false // Only interact if Spout player (Spout can allow vanilla clients to join)

        player.inventory.addItem(SpoutItemStack(Main.get().exampleBlock)) // Give player a Spout block
        player.updateInventory() // Update the player's inventory (temporary fix)
        return true
    }
}
