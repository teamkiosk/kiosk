package com.example.gimbapheaven

open class Meal : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        var mealData = MealData()
        var mealNumber = mutableListOf(0, 0, 0, 0, 0, 0)
        var tmp: Boolean = true
        println("[ 식사 메뉴 ]")
        var mealDetail = MealDetail()
        for ((j, i) in mealData.mealMenu.withIndex()) {
            print("${j}:")
            println(i)
        }
        println("----------------------\n")
        print("메뉴를 선택 하세요 : ")
        var num1: Int = readLine()!!.toInt()
        while (tmp){
            if (0<=num1 && num1<=mealData.mealMenu.size){
                tmp = false
            }
            else{
                println("입력한 값이 올바르지 않습니다. 다시 번호를 입력해주세요.")
                print("메뉴를 선택 하세요 : ")
                num1 = readLine()!!.toInt()
            }
        }

        mealNumber[num1] = mealDetail.mealDetail(mealData.mealMenu, mealData.mealDetailMenu, mealData.mealPrice, mealNumber, num1)

        return Triple(mealData.mealMenu[num1], mealData.mealPrice[num1]*mealNumber[num1], mealNumber[num1])
    }
}