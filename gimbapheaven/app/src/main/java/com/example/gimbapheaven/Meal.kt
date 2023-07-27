package com.example.gimbapheaven

class Meal : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        println("[ 식사 메뉴 ]")
        return Triple("제육 덮밥", 6.5, 1)
    }
}

