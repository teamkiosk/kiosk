package com.example.gimbapheaven

class MealDetail(): Meal() {
    fun mealDetail(mealMenu: List<String>, mealDetailMenu: List<String>, mealPrice: List<Double>, mealNumber: List<Int>, num1: Int): Int {
        print("${mealMenu[num1]}   | ")
        println(mealDetailMenu[num1])
        println("${mealMenu[num1]} 가격 : ${mealPrice[num1]}")
        print("선택 하신 메뉴 갯수를 입력 하세요 : ")
        var num2: Int = readLine()!!.toInt()
        while (true){
            if (num2 <=0 || num2 !is Int){
                print("선택 하신 메뉴 갯수를 다시 입력 하세요 : ")
                var num2: Int = readLine()!!.toInt()
            }
            else {
                break
            }
        }
        return num2
    }
}