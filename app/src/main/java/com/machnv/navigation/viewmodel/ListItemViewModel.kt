package com.machnv.navigation.viewmodel

import androidx.lifecycle.ViewModel
import com.machnv.navigation.data.Item

class ListItemViewModel: ViewModel() {

    fun createListItem(): MutableList<Item> {
        val list = mutableListOf<Item>()

        for (i in 0..20) {
            list.add(Item(i, "Product $i"))
        }
        return list
    }
}