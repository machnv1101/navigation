package com.machnv.navigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.machnv.navigation.data.Item

class DetailItemViewModel : ViewModel() {

    fun setData(item: Item) {
        nameProduct.value = item.name
        idProduct.value = item.id
    }

    private var nameProduct: MutableLiveData<String> = MutableLiveData("Name product")
    private var idProduct: MutableLiveData<Int> = MutableLiveData(0)

    fun getNameProduct(): LiveData<String> = nameProduct
    fun getIdProduct(): LiveData<Int> = idProduct

    fun onTitleDetailItemClick(){
        idProduct.value = idProduct.value?.plus(1)
    }
}