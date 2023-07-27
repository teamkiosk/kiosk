package com.example.gimbapheaven

class PorkCutlet : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        println("[ 돈가스 메뉴 ]")
        return Triple("돈까스", 7.0, 1)
    }
}