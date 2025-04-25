package com.example.kotlindersleri.degiskenler

fun main(){
    println("Merhaba Dunya")
    var id = 1
    var ad = "Mont"

    println("Id : $id")
    println("Ad : $ad")
    var sayi =30 //değiştirelebilir
    sayi= 100
    println(sayi)

    //sabitler
    val numara =50 //val kalıcı olarak değiştirilemez
    println(numara)

    //tür dönüşümü
    val d = 89.56
    val i = 34.56
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2
    var x = 90
    val sonuc3 = x.toString()
    println(sonuc3)

    //3
    val yazi ="48T"
    val sonuc4 = yazi.toIntOrNull()

    if(sonuc4 != null){
        println(sonuc4)
    }else{
        println("null")
    }
}