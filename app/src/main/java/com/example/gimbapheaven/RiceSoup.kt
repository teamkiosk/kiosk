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
                    val menuWithQuantity = selectedMenu.copy(second = totalPrice, third = quantityInput)

                    // Ask if the user wants to add to the shopping cart
                    print("장바구니에 추가하시겠습니까? (1. 예 / 2. 아니오): ")
                    val addToCart = readLine()

                    if (addToCart == "1") {
                        println("메뉴가 장바구니에 추가되었습니다.")
                        return menuWithQuantity
                    } else if (addToCart == "2") {
                        println("메뉴 추가를 취소합니다.")
                    } else {
                        println("잘못된 선택입니다. 다시 선택해주세요.")
                    }
                } else {
                    println("잘못된 수량입니다. 다시 선택해주세요.")
                }
            } else {
                println("잘못된 선택입니다. 다시 선택해주세요.")
            }
        }
    }
}
