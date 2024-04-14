package com.example.degiskenlerveveritipleri.oopKalıtımEv

class Villa(pencereSayisi:Int,var garajVarMi:Boolean):Ev(pencereSayisi) { //subclass Evden özelliğini alacağı için :Ev yazdık Evinde kendi parametresi (özelliği) var onuda tanımladık
}