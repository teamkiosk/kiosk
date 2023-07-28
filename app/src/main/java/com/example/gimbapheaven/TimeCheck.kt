//package com.example.gimbapheaven
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
//
//class TimeCheck {
//    @RequiresApi(Build.VERSION_CODES.O)
//    fun check(){
//    val current = LocalDateTime.now()
//    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
//    val formatted: String = current.format(formatter)
//    var str_Hour=formatted.substring(0 until 2).toInt()*3600
//    var str_Min=formatted.substring(3 until 5).toInt()*60
//    var str_Sec=formatted.substring(6 until 8).toInt()
//    var timeasint=str_Hour+str_Sec+str_Min
//        var back = Menu()
//
//
//
//    if (600>timeasint) {
//        println("시스템 점검중 입니다.  점검시간: ~00시10분")
//        back.totalMenu()
//    }
//    else if (timeasint>85800) {
//        println("시스템 점검중 입니다.  점검시간: 23시50분~")
//        back.totalMenu()
//    }
//
//
//}
//}