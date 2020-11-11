package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.restaurante.view.*

class ListaRestaurantesAdapter(private val restauranteList:List<Restaurante>, private val listener: OnItemClickListener): RecyclerView.Adapter<ListaRestaurantesAdapter.ListaRestaurantesViewHolder>()  {
    inner class ListaRestaurantesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val image: ImageView = itemView.item_image
        val nome: TextView = itemView.item_title
        val local: TextView = itemView.item_detail
        val horario: TextView = itemView.item_horario
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaRestaurantesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.restaurante, parent, false)
        return ListaRestaurantesViewHolder(itemView)
    }

    override fun getItemCount() = restauranteList.size

    override fun onBindViewHolder(holder: ListaRestaurantesViewHolder, position: Int) {
        val itemAtual = restauranteList[position]
        holder.image.setImageResource(itemAtual.img)
        holder.nome.text = itemAtual.nome
        holder.local.text = itemAtual.local
        holder.horario.text = itemAtual.horario

    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

}