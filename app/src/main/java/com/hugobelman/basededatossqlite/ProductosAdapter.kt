package com.hugobelman.basededatossqlite

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.item_producto.view.*

class ProductosAdapter(private val mContext: Context, private val listaProductos: List<Producto>) : ArrayAdapter<Producto>(mContext, 0, listaProductos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_producto, parent, false)

        val producto = listaProductos[position]

        layout.nombre.text = producto.nombre
        layout.precio.text = "$${producto.precio}"
        layout.marca.text = producto.marca
        layout.descripcion.text = producto.descripcion

        if (producto.imagen!=""){
            layout.imageView.setImageURI(producto.imagen.toUri())
        }
        layout.proveedor.text = producto.proveedor

        return layout
    }

}