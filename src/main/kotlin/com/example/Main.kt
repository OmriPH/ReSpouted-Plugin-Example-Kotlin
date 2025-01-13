package com.example

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin
import org.getspout.spoutapi.SpoutManager
import org.getspout.spoutapi.inventory.SpoutItemStack
import org.getspout.spoutapi.inventory.SpoutShapedRecipe
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe
import org.getspout.spoutapi.material.MaterialData

class Main : JavaPlugin() {
    lateinit var exampleItem: ExampleItem
    lateinit var exampleBlock: ExampleBlock
    lateinit var exampleFood: ExampleFood

    override fun onEnable() {
        instance = this
        // The items & blocks need to be initialised somewhere. Add as variable to this class so it can be referenced to add to inventories
        exampleItem = ExampleItem()
        exampleBlock = ExampleBlock()
        exampleFood = ExampleFood()

        // Basic 2x2 shaped recipe
        SpoutManager.getMaterialManager().registerSpoutRecipe(
            SpoutShapedRecipe(SpoutItemStack(exampleBlock, 1))
                .shape("ss", "ss")
                .setIngredient('s', MaterialData.sugarCane)
        )
        // Shapeless recipe
        SpoutManager.getMaterialManager().registerSpoutRecipe(
            SpoutShapelessRecipe(ItemStack(Material.SUGAR_CANE, 4))
                .addIngredient(1, exampleBlock)
        )
    }

    companion object {
        private lateinit var instance: Main
        fun get(): Main {
            return instance
        }
    }
}
