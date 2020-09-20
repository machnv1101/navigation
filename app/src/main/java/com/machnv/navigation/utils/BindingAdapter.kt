package com.machnv.navigation.utils

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:isOddId")
fun checkOddId(view: View, id: Int) {
    val tv = view as TextView
    when {
        id % 2 == 0 -> tv.text = "Id is not odd"
        else -> tv.text = "Id is Odd"
    }
}