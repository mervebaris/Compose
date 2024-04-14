package com.example.degiskenlerveveritipleri.ArrayList

fun main(){
    val meyveler = ArrayList<String>()
    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.isEmpty()) //false --meyveler arrayList boş mu diye sorduk false dönecek

    println(meyveler.count()) // count ve size ArrayListin boyutunu bize veirir ikiside aynı işlemi yapıyor ArrayListin 5 elemeanı var
    println(meyveler.size)

    println(meyveler.first()) // kayıt sırasına göre ilk elemanı verir
    println(meyveler.last()) // kayıt sırasına göre son elemanı verir

    println(meyveler.contains("kiraz")) // "..." yazılan elemanın veriler içerisinde var mı yok mu şeklinde kontrol eder

    println(meyveler.max()) // harf sırasına göre sıralama işlemi yapıyor en büyük elmanı geitriyor
    println(meyveler.min()) // en küçğk elemanı getiriyor ç türkçe karakter olduğu için en sonda yer alır


    println(meyveler.sort()) // listeyi harf sırasına göre sıralamaya sokar
    println(meyveler.toString()) //sonucu göremek için


    println(meyveler.reverse()) //ArrayListe tersine döndürülmüş oldu
    println(meyveler.toString())


    meyveler.removeAt(3) //3. ideksteki veriyi sildi KİRAZ silindi
    println(meyveler.toString())


    meyveler.remove("kivi") //ilgili veriyi bulup siliyor
    println(meyveler.toString())

    meyveler.clear() // bütün arrayListi siler
    println(meyveler.toString())








}