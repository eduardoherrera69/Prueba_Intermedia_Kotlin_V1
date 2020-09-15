package com.example.prueba_intermedia_kotlin_v1.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

private const val DATA_BASE_NAME = "OrderDataBase"
@Database(entities = [OrderTab::class],version = 1)
abstract class OrderDataBase : RoomDatabase() {

    abstract fun getOrderTabDao(): OrderDao

    companion object {

        @Volatile
        private var INSTANCE: OrderDataBase? = null

        fun getOrderDataBase(context: Context): OrderDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return  tempInstance
            }

        synchronized(this){
            val instance = Room.databaseBuilder(context, OrderDataBase::class.java, DATA_BASE_NAME).build()
            INSTANCE = instance
            return instance
        }
        }
    }


}

