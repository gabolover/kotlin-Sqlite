package com.hugobelman.basededatossqlite

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "productos")
class Producto(
    val nombre:String,
    val precio: Double,
    val descripcion: String,
    val marca: String,
    val imagen: String,
    val proveedor: String,
    @PrimaryKey(autoGenerate = true)
    var idProducto: Int = 0
) : Serializable