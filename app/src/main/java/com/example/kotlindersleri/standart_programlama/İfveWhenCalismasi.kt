package com.example.kotlindersleri.standart_programlama

fun main(){
    //val yas=19
   // if(yas>=18){
   //     println("Reşitsiniz")
  // else{
  //     println("Reşit değilsiniz")
  //  }

    val ka="admin"
    val s= 123456
    val sayi=10
    if(ka=="admin" && s==123456){
        println("Hoşgeldiniz")
    }
    else{
        println("Hatalı giriş")
    }
    if(sayi==9||sayi==10){
        println("Sayı 9 veya 10")
    }
    else{
        println("Sayı 9 veya 10 değil")
    }
    val number=5
    when(number){
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        5 -> println("Sayı 5'dir")
        else-> println("Bilinmeyen sayı")
    }
}