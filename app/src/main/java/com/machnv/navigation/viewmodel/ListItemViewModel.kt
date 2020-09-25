package com.machnv.navigation.viewmodel

import androidx.lifecycle.MutableLiveData
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

    private val nameProduct = MutableLiveData("")
    private val idProduct = MutableLiveData(0)

    fun getNameProduct() = nameProduct
    fun getIdProduct() = idProduct
    fun setNameProduct(name: String) {
        nameProduct.value = name
    }
    fun setIdProduct(id: Int) {
        idProduct.value = id
    }

    fun onClickTitleDetailItemFragment() {
        setNameProduct("sdhfjsdhf")
    }
}