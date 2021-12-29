package com.vijanaweusi.mitihaniapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val orodhaYaLugha: ArrayList<Languages>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = orodhaYaLugha[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.lugha

    }

    override fun getItemCount(): Int {

        return orodhaYaLugha.size
    }

    class MyViewHolder(itemView: View, listener: onItemClickListener ) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ImageView = itemView.findViewById(R.id.title_image)
        val tvHeading: TextView = itemView.findViewById(R.id.tv_heading)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }

        }

    }
}