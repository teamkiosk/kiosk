package com.example.gimbapheaven

class Gimbab() : DisplayInfo() {
    override fun pickMenu(): Triple<String, Double, Int> {
        //메뉴를 출력하고, 뒤로가기 버튼을 누를 시 Menu를 호출
        println("[ 김밥 메뉴 ]")
        // Lv3의 상속관계를 이용해서 개별 구현
        // 1. 원조 김밥   |  2.5 -> 2,500원 | 간단한 설명
        // 2. 참치 김밥   |  3.0 -> 3,000원 | 간단한 설명
        // 3. 치즈 김밥   |  3.0 -> 3,000원 | 간단한 설명
        // 4. 새우 김밥   |  3.5 -> 3,500원 | 간단한 설명
        // 5. 모듬 김밥  |   5.0 -> 5,000원 | 간단한 설명

        var pairValue = Triple("원조김밥", 2.5, 1)
        return pairValue
    }
}