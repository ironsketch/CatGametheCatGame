package com.example.catgamethecatgame

class Player(x: Int, y: Int): Entity(x, y) {
    private var name = ""
    private var currentLevel = 0
    private var highestLevel = 0
    fun updatePosition(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}