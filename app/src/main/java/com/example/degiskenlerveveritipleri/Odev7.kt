package com.example.degiskenlerveveritipleri

class Odev7 {
    fun internetHesaplama(GB:Int):Int{
        var ucret = 0
        if (GB > 50){
            val kotaAsimi = GB - 50
            ucret = 100 + kotaAsimi*4

        }else{
            ucret = 100
        }
        return ucret

    }
}