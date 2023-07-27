package com.example.single_expressionfunction

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    println("메인쓰레드 시작")
    var job = GlobalScope.launch {
        delay(3000)
        println("여기는 코루틴...")
    }
    println("메인쓰레드 종료")
}