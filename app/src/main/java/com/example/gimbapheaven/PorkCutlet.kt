package com.example.gimbapheaven

class PorkCutlet : DisplayInfo() {
    private val menuList = listOf(
        Triple("돈까스    ", 7.0, 7000),
        Triple("치즈돈까스  ", 8.0, 8000),
        Triple("고구마돈까스 ", 8.5, 8500)
    )

    override fun pickMenu(): Triple<String, Double, Int> {
        println("[ 돈가스 메뉴 ]")
        menuList.forEachIndexed { index, menu ->
            println("${index + 1}. ${menu.first} - ${menu.third} 원")
        }

        println("메뉴 번호를 선택해주세요 (뒤로 가려면 0을 입력하세요):")
        val menuInput = readLine()!!.toInt()

        if (menuInput == 0) {
            return Triple("", 0.0, 0)
        }

        val selectedMenu = menuList[menuInput - 1]
        val (name, price) = selectedMenu

        return if (selectedMenu != null) {
            println("개수를 선택해주세요:")
            val quantityInput = readLine()!!.toInt()
            if (quantityInput > 0) {
                addToCart(name, price, quantityInput)
                println("장바구니에 $name $quantityInput 개를 추가했습니다.")
                return Triple(name, price, quantityInput)

            } else {
                println("잘못된 개수를 선택했습니다.")
                Triple("", 0.0, 0)
            }
        } else {
            println("잘못된 메뉴 번호를 선택했습니다.")
            Triple("", 0.0, 0)

        }
    }
    private fun addToCart(name: String, price: Double, quantity: Int) {

    }
}

