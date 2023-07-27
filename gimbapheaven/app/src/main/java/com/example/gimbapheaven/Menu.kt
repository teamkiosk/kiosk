package com.example.gimbapheaven


import java.lang.Exception


class Menu {
    var totalOrder = mutableListOf<Triple<String, Double, Int>>()
    fun totalMenu() {
        while (true) {
            try {
                println(
                    "아래 메뉴판을 보시고 메뉴를 골라 번호를 입력해주세요." +
                            "\n[ GIMBABHEAVEN MENU ]" +
                            "\n1. 김밥    | 김 위에 밥을 펴 여러 반찬으로 말아 썰어 먹는 음식" +
                            "\n2. 국밥    | 국에 밥을 말아내는 음식" +
                            "\n3. 식사    | 끼니로 먹는 음식" +
                            "\n4. 분식    | 밀가루로 만들어 먹는 음식" +
                            "\n5. 돈가스  | 돼지 고기를 저민 뒤 튀김 옷을 입혀 튀기는 커틀릿 음식" +
                            "\n0. 종료    | 프로그램 종료"
                )
                inputMenu(readLine()!!.toInt())
                for (pair in totalOrder) {
                    println("메뉴 : ${pair.first}  가격 : ${pair.second}00원  개수 : ${pair.third}")
                }
            } catch (e: Exception) {
                println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
            }
        }
    }

    fun inputMenu(menu: Int) {
        while (true) {
            try {
                var order: Triple<String, Double, Int>
                when (menu) {
                    1 -> {
                        order = Gimbab().pickMenu()
                        totalOrder.add(Triple(order.first, order.second, order.third))
                        break
                    }

                    2 -> {
                        order = RiceSoup().pickMenu()
                        totalOrder.add(Triple(order.first, order.second, order.third))
                        break
                    }

                    3 -> {
                        order = Meal().pickMenu()
                        totalOrder.add(Triple(order.first, order.second, order.third))
                        break
                    }

                    4 -> {
                        order = SnackBar().pickMenu()
                        totalOrder.add(Triple(order.first, order.second, order.third))
                        break
                    }

                    5 -> {
                        order = PorkCutlet().pickMenu()
                        totalOrder.add(Triple(order.first, order.second, order.third))
                        break
                    }

                    0 -> {
                        println("프로그램을 종료합니다.")
                        System.exit(0)
                    }

                    else -> {
                        println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                        totalMenu()
                    }
                }
            } catch (e: Exception) {
            }
        }
    }
}

