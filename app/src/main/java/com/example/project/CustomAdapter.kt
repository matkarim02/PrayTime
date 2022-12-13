package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val dataSet: ArrayList<Zikr>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    var itemClickListener : ((Zikr) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      val zikr: TextView = itemView.findViewById(R.id.zikrName)
      val context: TextView = itemView.findViewById(R.id.zikrContext)


    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.zikr.text = item.zikrName
        holder.context.text = item.aboutZikr

        holder.itemView.setOnClickListener {
            itemClickListener?.invoke(item)
        }
    }


    override fun getItemCount() = dataSet.size

}
