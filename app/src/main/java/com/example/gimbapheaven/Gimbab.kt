package com.example.gimbapheaven

import java.lang.Exception

open class Gimbab() : DisplayInfo() {
    override fun pickMenu(): Triple<String, Double, Int> {
        var goBack = Menu()
        var orderValue: Triple<String, Double, Int> = Triple("", 0.0, 0)
        println(
            "[ 김밥 메뉴 ]\n" +
                    "1. 원조 김밥   |  W 2.5  | 각종야채를 말아 만든 김밥\n" +
                    "2. 참치 김밥   |  W 3.0  | 각종야채에 참치와 마요네즈를 추가한 김밥\n" +
                    "3. 치즈 김밥   |  W 3.0  | 각종야채에 치즈가 추가된 김밥\n" +
                    "4. 새우 김밥   |  W 3.5  | 여러채소에 새우를 추가한 김밥\n" +
                    "5. 돈가스 김밥  |  W 4.0  | 여러채소에 돈가스가 추가된 김밥\n" +
                    "0. 뒤로가기"
        )
        try {
            when (readLine()!!.toInt()) {

                1 -> {
                    orderValue = SelectedGimbab("원조 김밥", 2.5).gimbabFunction()
                }

                2 -> {
                    orderValue = SelectedGimbab("참치 김밥", 3.0).gimbabFunction()
                }

                3 -> {
                    orderValue = SelectedGimbab("치즈 김밥", 3.0).gimbabFunction()
                }

                4 -> {
                    orderValue = SelectedGimbab("새우 김밥", 3.5).gimbabFunction()
                }

                5 -> {
                    orderValue = SelectedGimbab("돈가스 김밥", 4.0).gimbabFunction()
                }

//                0 -> {
//                    goBack.totalMenu()
//                }
                else -> {
                    println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                }
            }
        } catch (e: Exception) {
        }

        return Triple(orderValue.first, orderValue.second, orderValue.third)
    }

    open fun gimbabFunction(): Triple<String, Double, Int> {
        return Triple("", 0.0, 0)
    }
}

class SelectedGimbab(name: String, price: Double) : Gimbab() {
    var name = name
    var price = price
    var count = 0

    init {
        this.name = name
        this.price = price
    }

    override fun gimbabFunction(): Triple<String, Double, Int> {
        while (true) {
            try {
                println(
                    "${name}  |  ${price}\n" +
                            "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                            "1. 확인      2. 취소"
                )

                when (readLine()!!.toInt()) {
                    1 -> {
                        println("수량을 입력 해주세요. ex) 1")
                        count = readLine()!!.toInt()
                        println("${name}이 장바구니에 추가되었습니다.")

                    }
//                        2 -> {
//                            pickMenu()
//                        }
                    else -> {
                        println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                    }
                }

                return Triple(name, price, count)
            } catch (e: Exception) {
            }
        }
    }
}
