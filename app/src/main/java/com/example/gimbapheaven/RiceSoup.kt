package com.example.gimbapheaven

class RiceSoup : DisplayInfo() {
    override fun pickMenu(): Triple<String, Double, Int> {
        println("[ 국밥 메뉴 ]")
        // Triple의 첫 번째 요소는 메뉴 이름, 두 번째 요소는 가격, 세 번째 요소는 수량입니다.
        val menuList = listOf(
            Triple("콩나물 국밥", 6.0, 1),
            Triple("소고기 국밥", 8.5, 1),
            Triple("순대 국밥", 7.8, 1),
            Triple("돼지 국밥", 7.2, 1),
            Triple("선지 국밥", 7.5, 1)
        )

        for ((index, menu) in menuList.withIndex()) {
            println("${index + 1}. ${menu.first} | ${menu.second}원 | ${menu.third}개")
        }

        while (true) {
            print("선택: ")
            val userInput = readLine()?.toIntOrNull()

            if (userInput != null && userInput in 1..menuList.size) {
                val selectedMenu = menuList[userInput - 1]
                print("수량을 입력해주세요: ")
                val quantityInput = readLine()?.toIntOrNull()

                if (quantityInput != null && quantityInput > 0) {
                    val totalPrice = selectedMenu.second * quantityInput
                    return selectedMenu.copy(second = totalPrice, third = quantityInput)
                } else {
                    println("잘못된 수량입니다. 다시 선택해주세요.")
                }
            } else {
                println("잘못된 선택입니다. 다시 선택해주세요.")
            }
        }
    }
}
