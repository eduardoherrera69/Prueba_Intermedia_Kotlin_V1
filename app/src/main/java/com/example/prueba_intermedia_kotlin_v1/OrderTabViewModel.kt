package com.example.prueba_intermedia_kotlin_v1

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.FtsOptions
import com.example.prueba_intermedia_kotlin_v1.database.OrderDataBase
import com.example.prueba_intermedia_kotlin_v1.database.OrderTab
import kotlinx.coroutines.launch

class OrderTabViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: OrderTabRepository
    val allOrderTab: LiveData<List<OrderTab>>

    init {
        val orderDao = OrderDataBase.getOrderDataBase(application).getOrderTabDao()
        repository = OrderTabRepository(orderDao)
        allOrderTab = repository.listAllOrderTab
    }

    fun insertOrderTab(orderTab: OrderTab) = viewModelScope.launch {
        repository.insertOrderTab(orderTab)
    }



}