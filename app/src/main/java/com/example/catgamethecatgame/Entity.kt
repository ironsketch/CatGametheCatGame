package com.example.catgamethecatgame

open class Entity (x: Int, y: Int) {
    var image = ""
    var x = x
    var y = y

    fun gravity(){
        // TODO
        // This needs to be a function that updated the x and y based on gravity
    }

    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}