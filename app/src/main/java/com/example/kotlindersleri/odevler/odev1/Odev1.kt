package com.example.kotlindersleri.odevler.odev1

fun main() {
    // Genel bilgiler
    val sehir = "İstanbul"
    val ulke = "Türkiye"
    val telefon = "+90 530 123 4567"
    val postaKodu = "34000"
    val email = "ornek@mail.com"
    val meslek = "Yazılım Geliştirici"
    val dogumGunu = "1995-06-15"
    val medeniDurum = "Bekar"

    // Müşteri bilgileri
    val musteriAdi = "Ali Yılmaz"
    val bakiye = 1520.75
    val maas = 18000.0
    val stokMiktari = 25
    val urunYorum = "Çok kullanışlı bir ürün."

    // Sipariş ve ödeme
    val odemeTarihi = "2025-04-20"
    val odeme = 299.99
    val siparisAdeti = 3
    val indirimMiktari = 25.0
    val takipKodu = "TR1234567890"

    // Ürün detayları
    val urunAdi = "Kablosuz Kulaklık"
    val urunPuani = 4.8
    val marka = "XBrand"
    val renk = "Siyah"
    val renkKodu = "#000000"
    val agirlik = 0.25 // kg

    // Yayın ve medya
    val kitapAdi = "Kotlin ile Programlama"
    val yayinlamaTarihi = "2022-10-01"
    val muzikAdi = "Lo-fi Coding Beats"
    val videoSuresi = "12:45"
    val resimAdi = "manzara.jpg"
    val dosyaFormati = "JPEG"

    // Coğrafi konum
    val enlem = 41.0082
    val boylam = 28.9784

    // Ulaşım ve konum
    val sokakAdi = "Cumhuriyet Caddesi"
    val otobusHatti = "34AS"
    val kalanDakika = 7
    val faturaAdresi = "Cumhuriyet Cad. No:10 Beşiktaş / İstanbul"

    // Teknoloji
    val telefonModeli = "Samsung Galaxy S24"
    val ekranBoyutu = 6.1 // inç

    // Diğer bilgiler
    val arabaModeli = "Toyota Corolla"
    val odaSayisi = 2
    val yemekFiyati = 85.0
    val ulusalGun = "29 Ekim Cumhuriyet Bayramı"
    val tatilGunu = "1 Mayıs Emek ve Dayanışma Günü"
    val rezervasyonTarihi = "2025-08-10"
    val kuponSuresi = "30 gün"
    val kuponKodu = "KOTLIN30"

    // BAŞLANGIÇ: BİLGİLERİ YAZDIR
    println("Müşteri Bilgileri")
    println("Ad Soyad         : $musteriAdi")
    println("Doğum Günü       : $dogumGunu")
    println("Medeni Durum     : $medeniDurum")
    println("Meslek           : $meslek")
    println("Maaş             : $maas TL")
    println("Bakiye           : $bakiye TL")
    println("Email            : $email")
    println("Telefon          : $telefon")
    println("Adres            : $sokakAdi, $postaKodu - $sehir / $ulke\n")

    println("Ürün ve Sipariş Bilgileri")
    println("Sipariş Edilen Ürün : $urunAdi")
    println("Marka               : $marka")
    println("Renk                : $renk ($renkKodu)")
    println("Ağırlık             : $agirlik kg")
    println("Ürün Puanı          : $urunPuani")
    println("Yorum               : \"$urunYorum\"")
    println("Stok Miktarı        : $stokMiktari adet")
    println("Sipariş Adedi       : $siparisAdeti")
    println("İndirim Miktarı     : $indirimMiktari TL")
    println("Toplam Ödeme        : $odeme TL")
    println("Ödeme Tarihi        : $odemeTarihi")
    println("Takip Kodu          : $takipKodu\n")

    println("Teslimat ve Lokasyon Bilgileri")
    println("Fatura Adresi       : $faturaAdresi")
    println("Koordinatlar        : Enlem $enlem / Boylam $boylam")
    println("Otobüs Hattı        : $otobusHatti (Tahmini geliş: $kalanDakika dakika)\n")

    println("Medya ve Dijital İçerikler")
    println("Kitap Adı           : \"$kitapAdi\" ($yayinlamaTarihi)")
    println("Müzik               : $muzikAdi")
    println("Video Süresi        : $videoSuresi")
    println("Resim Adı           : $resimAdi ($dosyaFormati formatında)\n")

    println("Cihaz Bilgileri")
    println("Kullanılan Telefon  : $telefonModeli")
    println("Ekran Boyutu        : $ekranBoyutu inç\n")

    println("Diğer Bilgiler")
    println("Araba Modeli        : $arabaModeli")
    println("Oda Sayısı          : $odaSayisi")
    println("Yemek Fiyatı        : $yemekFiyati TL")
    println("Kupon Kodu          : $kuponKodu (Geçerlilik: $kuponSuresi)")
    println("Rezervasyon Tarihi  : $rezervasyonTarihi")
    println("Ulusal Gün          : $ulusalGun")
    println("Tatil Günü          : $tatilGunu")
}
