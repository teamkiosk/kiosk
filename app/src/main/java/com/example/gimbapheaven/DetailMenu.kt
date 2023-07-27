package com.example.gimbapheaven

abstract class DisplayInfo {
    abstract fun pickMenu(): Triple<String, Double, Int>
    // 메뉴, 가격, 개수
}

