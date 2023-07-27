package com.example.gimbapheaven

import java.lang.Exception

open class Gimbab() : DisplayInfo() {
    val tripleList: MutableList<Triple<String, Double, Int>> = mutableListOf(
        Triple("원조 김밥", 2.5, 0),
        Triple("참치 김밥", 3.0, 0),
        Triple("치즈 김밥", 3.0, 0),
        Triple("새우 김밥", 3.5, 0),
        Triple("돈가스 김밥", 4.0, 0)
    )

    override fun pickMenu(): Triple<String, Double, Int> {
        while (true) {
            try {
                println(
                    "[ 김밥 메뉴 ]\n" +
                            "1. 원조 김밥   |  W 2.5  | 각종야채를 말아 만든 김밥\n" +
                            "2. 참치 김밥   |  W 3.0  | 각종야채에 참치와 마요네즈를 추가한 김밥\n" +
                            "3. 치즈 김밥   |  W 3.0  | 각종야채에 치즈가 추가된 김밥\n" +
                            "4. 새우 김밥   |  W 3.5  | 여러채소에 새우를 추가한 김밥\n" +
                            "5. 돈가스 김밥  |  W 4.0  | 여러채소에 돈가스가 추가된 김밥"
                )
                var inputNumber = tripleList[readLine()!!.toInt() - 1]
                println("수량을 입력 해주세요.")
                val newQuantity = readLine()!!.toInt()
                println("입력한 수량 : ${newQuantity}")
                for ((idx, triple) in tripleList.withIndex()) {
                    if (triple.first == inputNumber.first) {
                        tripleList[idx] = tripleList[idx].copy(third = newQuantity)
                        println(
                            "메뉴 : ${tripleList[idx].first}  | 금액 : W ${tripleList[idx].second}  |  개수 : ${tripleList[idx].third}\n" +
                                    "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인      2. 취소"
                        )
                        when (readLine()?.toIntOrNull()) {
                            1 -> {
                                println("${tripleList[idx].first}이 장바구니에 추가되었습니다.")
                                return Triple(
                                    tripleList[idx].first,
                                    tripleList[idx].second,
                                    tripleList[idx].third
                                )
                            }

                            2 -> {}

                            else -> {
                                println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                            }
                        }
                    }
                }
            } catch (e: Exception) {
            }
        }
    }
}
