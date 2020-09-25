package com.machnv.navigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    private val count = MutableLiveData(100)

    fun getCount(): LiveData<Int> = count

    private fun setCount(number: Int){
        count.value = count.value?.plus(number)
    }

    fun onClickAdd(){
        setCount(10)
    }
}