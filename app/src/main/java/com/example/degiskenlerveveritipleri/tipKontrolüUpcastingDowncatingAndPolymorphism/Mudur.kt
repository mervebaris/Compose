package com.example.degiskenlerveveritipleri.tipKontrolüUpcastingDowncatingAndPolymorphism

class Mudur:Personel() {
    fun iseAl(p:Personel){ //BU FONKSİYON PERSONEL SINIFINDAN BİR NESNE İSTEYECEK O YÜZDEN PARAMAETRE OLUŞTURDUK. PERSONEL SINIFINDAN TÜEMİŞ BİR NESNE GÖNDER DEDİK(POLYMORPHİSM)

        p.iseAlindi()

    }

    fun terfiEttir(p:Personel){
       // (p as Ogretmen).maasArttir() //Downcasting yaptık üst sınıfı altsınıfa dönüştürdük ve oradaki sınıfı aldık. Personelden öğretmene eriştik öğretmenin maaş arttır fonksiyonu aldık

        if(p is Ogretmen){  //is diyerek tip kontrolü yaptık
            p.maasArttir()
        }

        if (p is Isci){
            println("İşçiler terfi almaz")
        }
    }
}