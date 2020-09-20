package com.machnv.navigation.adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.machnv.navigation.data.Item
import com.machnv.navigation.databinding.ItemProductBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private var itemProductClickListener: ItemProductClickListener? = null

    var listItem = listOf<Item>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class ListViewHolder(private val itemProductBinding: ItemProductBinding) :
        RecyclerView.ViewHolder(itemProductBinding.root) {

        fun onBind(position: Int) {
            val itemProduct = listItem[position]
            itemProductBinding.tvName.text = itemProduct.name
            itemProductBinding.tvId.text = itemProduct.id.toString()
            itemProductBinding.llItemProduct.setOnClickListener {
                itemProductClickListener?.onItemProductClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemProduct = ItemProductBinding.inflate(inflater)
        return ListViewHolder(itemProduct)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int = listItem.size

    interface ItemProductClickListener {
        fun onItemProductClick(position: Int)
    }

    fun setOnItemClickListener(itemProductClickListener: ItemProductClickListener) {
        this.itemProductClickListener = itemProductClickListener
    }
}