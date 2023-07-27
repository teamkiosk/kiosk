package com.example.gimbapheaven

data class MealData(
    var mealMenu: MutableList<String> = mutableListOf("김치 찌개", "된장 찌개", "부대 찌개", "육개장", "뚝배기 불고기", "직화 낙지 덮밥"),
    var mealDetailMenu: MutableList<String> = mutableListOf("김치와 돼지 고기가 들어간 맛있는 찌개", "시골 된장을 사용한 맛있는 된장 찌개", "시크릿 양념이 들어간 맛있는 부대 찌개", "오랫 동안 육수를 우려서 만든 최상급 육개장 ", "각종 맛있는 야채와 질 좋은 고기가 듬뿍 들어가 있는 맛있는 뚝배기 불고기", "직화로 만들어 불 맛이 제대로 느낄 수 있는 요리"),
    var mealPrice: MutableList<Double> = mutableListOf(9.0, 8.5, 10.0, 13.0, 14.0, 20.0),

)
