package com.example.gimbapheaven

class Orders : Menu() {
    fun orders(totalOrder: MutableList<Triple<String, Double, Int>>) {
        val menu = Menu()
        var sum: Double = 0.0
        var pay: Double = 3.0
        println("[ Orders ]")
        for (pair in totalOrder) {
            if(pair.first != "" && pair.second != 0.0 && pair.third != 0){
                println("메뉴 : ${pair.first}  가격 : ${pair.second}00원  개수 : ${pair.third}")
            }
        }
        println("[ Total ]")
        for (total in totalOrder){
            sum += total.second
        }
        println("주문한 금액: W $sum")
        println(" 1. 주문     2. 메뉴판")
        var num3: Int = readLine()!!.toInt()
        when (num3) {
            1 -> {
                if (pay>sum){
                    println("주문이 완료 되었습니다. 잔액은 ${pay-sum}W 입니다. ")
                }
                if (pay<sum){
                    println("현재 잔액은 ${pay}W 으로 ${sum-pay}W이 부족 해서 주문할 수 없습니다.")
                }
            }
            2 -> {
                menu.totalMenu()
            }
            else -> {
                println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                num3= readLine()!!.toInt()
            }
        }
    }
}