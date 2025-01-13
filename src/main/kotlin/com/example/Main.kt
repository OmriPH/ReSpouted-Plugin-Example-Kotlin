package com.example

import org.bukkit.plugin.java.JavaPlugin

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
    }

    companion object {
        private lateinit var instance: Main
        fun get(): Main {
            return instance
        }
    }
}
