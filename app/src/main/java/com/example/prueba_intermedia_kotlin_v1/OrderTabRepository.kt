package com.example.prueba_intermedia_kotlin_v1

import androidx.lifecycle.LiveData
import com.example.prueba_intermedia_kotlin_v1.database.OrderDao
import com.example.prueba_intermedia_kotlin_v1.database.OrderTab

//OJO AQUI

class OrderTabRepository(private val mOrderDao: OrderDao) {

    val listAllOrderTab : LiveData<List<OrderTab>> = mOrderDao.getAllOrderFromOrderTab()

    //OJO AQUI
    suspend fun insertOrderTab(mOrderTab: OrderTab){
      mOrderDao.insertOneOrder(mOrderTab)
    }


}