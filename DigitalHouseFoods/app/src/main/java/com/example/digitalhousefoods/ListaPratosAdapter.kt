package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prato.view.*

class ListaPratosAdapter(private val pratosList: ArrayList<Prato>, private val listener: OnItemClickListenerPrato): RecyclerView.Adapter<ListaPratosAdapter.ListaPratosViewHolder>()  {
    inner class ListaPratosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val image: ImageView = itemView.item_image_prato
        val nome: TextView = itemView.item_titulo_prato
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaPratosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.prato, parent, false)
        return ListaPratosViewHolder(itemView)
    }

    override fun getItemCount() = pratosList.size

    override fun onBindViewHolder(holder: ListaPratosViewHolder, position: Int) {
        val itemAtual = pratosList[position]
        holder.image.setImageResource(itemAtual.img)
        holder.nome.text = itemAtual.nome

    }

    interface OnItemClickListenerPrato {
        fun onItemClick(position: Int)
    }

}