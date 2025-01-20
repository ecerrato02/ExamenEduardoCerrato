package com.example.exameneduardocerrato.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Primer archivo para hacer
@Entity(tableName = "Moble")
data class Mobles(
    @ColumnInfo(name = "moble_name")
    var nombre: String,

    @ColumnInfo(name = "moble_price")
    var precio: Int,

){
    @PrimaryKey(autoGenerate = true)
    var id: Int?=null
}
