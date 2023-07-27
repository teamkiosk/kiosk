package com.example.gimbapheaven

class SnackBar : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        println("[ 분식 메뉴 ]")
        return Triple("유부 우동", 5.0, 1)
    }
}