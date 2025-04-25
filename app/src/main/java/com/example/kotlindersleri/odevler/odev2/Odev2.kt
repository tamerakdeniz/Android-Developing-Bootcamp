package com.example.kotlindersleri.odevler.odev2

class Odev2 {

    // 1. Dereceyi Fahrenheit’a çeviren metod
    fun dereceToFahrenheit(derece: Double): Double {
        return derece * 1.8 + 32
    }

    // 2. Dikdörtgenin çevresini hesaplayan metod
    fun dikdortgenCevre(kisaKenar: Int, uzunKenar: Int): Int {
        return 2 * (kisaKenar + uzunKenar)
    }

    // 3. Faktöriyel hesaplayan metod
    fun faktoriyel(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    // 4. Kelime içinde kaç adet 'a' harfi olduğunu bulan metod
    fun harfSayisi(kelime: String): Int {
        return kelime.count { it.lowercaseChar() == 'a' }
    }

    // 5. Kenar sayısına göre çokgenin iç açıları toplamını hesaplayan metod
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    // 6. Gün sayısına göre maaş hesaplayan metod
    fun maasHesapla(gunSayisi: Int): Int {
        val calismaSaati = gunSayisi * 8
        val mesaiSiniri = 160
        return if (calismaSaati <= mesaiSiniri) {
            calismaSaati * 10
        } else {
            val normalSaat = mesaiSiniri
            val mesaiSaat = calismaSaati - mesaiSiniri
            (normalSaat * 10) + (mesaiSaat * 20)
        }
    }

    // 7. Kota miktarına göre internet faturası hesaplayan metod
    fun kotaUcreti(kullanilanGB: Int): Int {
        val sabitUcret = 100
        return if (kullanilanGB <= 50) {
            sabitUcret
        } else {
            val asimMiktari = kullanilanGB - 50
            sabitUcret + (asimMiktari * 4)
        }
    }
}

