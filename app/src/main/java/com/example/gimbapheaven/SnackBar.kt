package com.example.gimbapheaven

class SnackBar : DisplayInfo() {
    override fun pickMenu() : Triple<String, Double, Int>{
        println("[ 분식 메뉴 ]")
        println("1. 떡볶이　　　1인분 3,000원")
        println("2. 튀김　　　　1인분 2,500원")
        println("3. 소떡소떡　　1인분 3,500원")
        println("4. 어묵　　　　1개　   500원")
        println("5. 라면　　　　1인분 2,500원")
        println("메뉴 번호를 입력해 주세요")
        var pick=readLine()!!.toInt()
        if(pick<=0){
            println("올바른 번호를 입력해 주세요")
            pickMenu()
        }


        println("메뉴 수량을 입력해 주세요")
        var quantity =  readLine()!!.toInt()
        if(pick<=0){
            println("올바른 수량을 입력해 주세요")
            pickMenu()
        }



        return when (pick) {
            1 -> return Triple("떡볶이", quantity*3.0, quantity)
            2 -> return Triple("튀김", quantity*2.5, quantity)
            3 -> return Triple("소떡소떡", quantity*3.5, quantity)
            4 -> return Triple("어묵", quantity*0.5, quantity)
            5 -> return Triple("라면", quantity*2.5, quantity)
            //6->Menu.totalMenu()
            else -> pickMenu()
        }



    }
}