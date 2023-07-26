package com.example.gimbapheaven

class RiceSoup : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        println("[ 국밥 메뉴 ]")
        return Triple("콩나물 국밥", 6.0, 1)
    }
}