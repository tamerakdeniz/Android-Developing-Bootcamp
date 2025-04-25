package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan
    fun selamla1(){
        val sonuc = "Merhaba Tamer"
        println(sonuc)
    }
    //return - hem işlem yapan hem veri transferi yapan anlamına geliyor
    fun selamla2() : String{
        val sonuc = "Merhaba Tamer"
        return sonuc
    }
    fun selamla3(isim:String) {
        val sonuc = "Merhaba Tamer"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak
    fun topla(sayi1:Int,sayi2:Int) {
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Double) {
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Int,isim:String) {
        println("Toplama : ${sayi1 + sayi2} - İşlem yapan : $isim")
    }

}