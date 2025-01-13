package com.example

import org.getspout.spoutapi.material.item.GenericCustomFood

// Plugin instance, Item ID, url to PNG texture, Hunger restored
class ExampleFood : GenericCustomFood(Main.get(), "examplefood", "https://i.ibb.co/sCFvQBD/q6wBozz.png", 5) {
    init {
        name = "Example Food" // Set food name
    }
}
