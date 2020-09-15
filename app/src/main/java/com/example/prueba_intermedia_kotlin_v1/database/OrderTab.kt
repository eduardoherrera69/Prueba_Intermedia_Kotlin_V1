package com.example.prueba_intermedia_kotlin_v1.database

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "OrderTab")
data class OrderTab (
                        @PrimaryKey
                        @NonNull
                        val id: Int,
                        val order: String,
                        val quant: Int,
                        val price: Int )