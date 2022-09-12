package com.thaa.viewmodeltest

import androidx.lifecycle.ViewModel

class ClassViewModel: ViewModel() {

    var angka = 0

    fun tambahAngka(){
        angka++
    }

    fun kurangAngka(){
        angka--
    }
}