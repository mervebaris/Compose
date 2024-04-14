package com.example.degiskenlerveveritipleri.interfaceOrnekleri

open class Interface2Elma :Interface2Eatable,Interface2Squeezable {
    override fun howToEat() {
       println("Dilimle ve ye")
    }

    override fun howToSqueeze() {
        println("Blender ile sık")
    }
}