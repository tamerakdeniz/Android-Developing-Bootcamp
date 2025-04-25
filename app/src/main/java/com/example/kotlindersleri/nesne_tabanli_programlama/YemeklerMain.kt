package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1= Yemekler(100,"Köfte",249)
    //Değer okuma
    println("----------------")
    println("Yemek id : ${y1.id}")
    println("Yemek ad : ${y1.ad}")
    println("Yemek fiyat : ${y1.fiyat}")
    //Değer atama
    y1.fiyat =350
    println("----------------")
    println("Yemek id : ${y1.id}")
    println("Yemek ad : ${y1.ad}")
    println("Yemek fiyat : ${y1.fiyat}")

    val y2= Yemekler(101,"Baklava",300)
    println("----------------")
    println("Yemek id : ${y2.id}")
    println("Yemek ad : ${y2.ad}")
    println("Yemek fiyat : ${y2.fiyat}")

    y1.bilgiAl()
    y2.bilgiAl()
}

