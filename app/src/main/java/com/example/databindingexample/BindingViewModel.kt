package com.example.databindingexample

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class BindingViewModel : ViewModel() {

    var color = ObservableField("#000000")
    var name = ObservableField("Toshkent")

    fun onRedButtonClick() {
        color.set("#FF0011")
        name.set("RED")
    }

    fun onBlueButtonClick() {
        color.set("#2196F3")
        name.set("BLUE")
    }

}