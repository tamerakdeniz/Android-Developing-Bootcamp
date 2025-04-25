package com.example.kotlindersleri.odevler.odev2

fun main() {
    val odev = Odev2()

    // 1. Derece → Fahrenheit
    val fahrenheit = odev.dereceToFahrenheit(30.0)
    println("1. 30 derece Fahrenheit cinsinden: $fahrenheit")

    // 2. Dikdörtgen çevresi
    val cevre = odev.dikdortgenCevre(5, 10)
    println("2. 5 ve 10 uzunluklarında kenarlarla dikdörtgenin çevresi: $cevre")

    // 3. Faktöriyel hesaplama
    val faktoriyel = odev.faktoriyel(5)
    println("3. 5! = $faktoriyel")

    // 4. 'a' harfi sayısı
    val kelime = "Ankara'da bahar başka güzel."
    val aSayisi = odev.harfSayisi(kelime)
    println("4. \"$kelime\" ifadesinde ${aSayisi} adet 'a' harfi var.")

    // 5. Çokgen iç açı toplamı
    val icAci = odev.icAciToplami(6)
    println("5. 6 kenarlı çokgenin iç açıları toplamı: $icAci")

    // 6. Maaş hesaplama
    val maas = odev.maasHesapla(22)
    println("6. 22 gün çalışan birinin maaşı: $maas ₺")

    // 7. Kota ücreti hesaplama
    val kotaUcreti = odev.kotaUcreti(75)
    println("7. 75 GB internet kullanan birinin ödeyeceği ücret: $kotaUcreti ₺")
}
