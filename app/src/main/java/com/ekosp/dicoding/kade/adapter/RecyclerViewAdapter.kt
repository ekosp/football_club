package com.ekosp.dicoding.kade.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ekosp.dicoding.kade.model.ClubItem
import com.ekosp.dicoding.kade.R
import com.squareup.picasso.Picasso

/**
 * Created by eko on 16/10/18.
 * Email : eko.purnomo@salt.co.id
 */
class RecyclerViewAdapter(private val context: Context, private val items: List<ClubItem>,
                          private val listener: (ClubItem) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.name)
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: ClubItem, listener: (ClubItem) -> Unit) {
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(image) }

            // on click
            itemView.setOnClickListener {
                listener(items)
            }
        }
    }
}