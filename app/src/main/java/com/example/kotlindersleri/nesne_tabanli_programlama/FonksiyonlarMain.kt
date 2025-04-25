package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()
    //void = unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Tamer")

    f.topla( 10 ,20,"Tamer")


}