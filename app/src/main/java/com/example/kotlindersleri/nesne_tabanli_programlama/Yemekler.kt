package com.example.kotlindersleri.nesne_tabanli_programlama

class Yemekler(var id:Int,var ad:String, var fiyat:Int) {
    //constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın.
    init {
        println("**** Nesne oluştu")
    }
    fun bilgiAl(){
        println("----------------")
        println("Id     :${id}")
        println("Ad     :${ad}")
        println("Fiyat  :${fiyat}")
    }
    //this : Bulunduğumuz sınıfı temsil eder
    //super: Kalıtım ile bir üst sınıfı temsil eder
}