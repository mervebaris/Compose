package com.example.degiskenlerveveritipleri

class Kisiler(var ad:String, var yas:Int) { //DIŞARIDAN PARAMETRE ALACAK ŞEKİLDE VARSAYILAN DEĞER AKTARMADAN BİR NESNE OLUŞTURABİLECEK HALE GETİREBİLİRİZ
   /*var ad: String = "MERVE"
    var yas:Int = 31*/

    init {
        println("Kişi nesnesi oluşturuldu")
    }
}