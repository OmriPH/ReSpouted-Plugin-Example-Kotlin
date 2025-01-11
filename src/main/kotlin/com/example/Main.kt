package com.example

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    lateinit var exampleItem: ExampleItem
    lateinit var exampleBlock: ExampleBlock

    override fun onEnable() {
        // The item needs to be initialised somewhere. Add as variable to this class so it can be referenced to add to inventories
        instance = this
        exampleItem = ExampleItem()
        exampleBlock = ExampleBlock()
    }

    companion object {
        private lateinit var instance: Main
        fun get(): Main {
            return instance
        }
    }
}
