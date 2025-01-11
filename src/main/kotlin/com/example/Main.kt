package com.example

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    lateinit var exampleItem: ExampleItem

    override fun onEnable() {
        // The item needs to be initialised somewhere. Add as variable to this class so it can be referenced to add to inventories
        instance = this
        exampleItem = ExampleItem()
    }

    companion object {
        private lateinit var instance: Main
        fun get(): Main {
            return instance
        }
    }
}
