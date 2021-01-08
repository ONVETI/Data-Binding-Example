package com.example.databindingexample

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:email", "app:color")
fun setEmail(textView: TextView, name: String, color: String) {
    textView.text = "${name}@gmail.com"
    textView.setTextColor(Color.parseColor(color))
}


/*ishlatilgani yo'q*/
@BindingAdapter("app:customTextColor")
fun setTextColor(textView: TextView, color: String) {
    textView.setTextColor(Color.parseColor(color))
}
