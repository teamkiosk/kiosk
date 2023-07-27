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
        var menunum=readLine()!!.toInt()
//        if(pick<=0){
//            println("올바른 번호를 입력해 주세요")
//            pickMenu()
//        }
//          기능상 오류발견.  적용보류

        println("메뉴 수량을 입력해 주세요")
        var quantity =  readLine()!!.toInt()
//        if(quantity<=0){
//            println("올바른 수량을 입력해 주세요")
//            pickMenu()
//        }
//          기능상 오류발견.  적용보류


         var pick=when (menunum) {
            1 -> Triple("떡볶이", quantity*3.0, quantity)
            2 -> Triple("튀김", quantity*2.5, quantity)
            3 -> Triple("소떡소떡", quantity*3.5, quantity)
            4 -> Triple("어묵", quantity*0.5, quantity)
            5 -> Triple("라면", quantity*2.5, quantity)
            //6->Menu.totalMenu()
            else -> pickMenu()
        }
        println("해당 메뉴를 추가하시겠습니까?")
        println("1. 추가   2. 취소")
        var confirm = readLine()!!.toInt()
        when(confirm){
            1-> {
                return pick
            }
            2-> {
                println("취소되었습니다.  초기 메뉴로 돌아갑니다")
                pickMenu()
            }

            else-> {
                println("잘못된 입력입니다.  초기 메뉴로 돌아갑니다")
                pickMenu()
            }
        }
return pick
    }
}
