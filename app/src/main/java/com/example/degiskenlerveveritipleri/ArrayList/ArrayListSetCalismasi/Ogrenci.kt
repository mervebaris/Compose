package com.example.degiskenlerveveritipleri.ArrayList.ArrayListSetCalismasi

class Ogrenci(var no:Int, var ad:String, var sinif:String) {

    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if (this.no == (other as Ogrenci).no){  //Downcasting ile üst sınıftaki other:Any as ile Ogrenciye çevirdik
            return true
        }else{
            return false
        }
    }
}