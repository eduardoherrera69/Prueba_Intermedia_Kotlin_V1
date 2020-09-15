package com.example.prueba_intermedia_kotlin_v1.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOneOrder(orderTab: OrderTab)

    @Update
    fun updateOneOrder(orderTab: OrderTab)

    @Delete
    fun deleteOneOrder(orderTab: OrderTab)

    @Query("SELECT * FROM OrderTab")
    fun getAllOrderFromOrderTab():LiveData<List<OrderTab>>

@Query("SELECT * FROM OrderTab WHERE id = :id")
fun getOneOrderTabByID(id: Int): OrderTab


}