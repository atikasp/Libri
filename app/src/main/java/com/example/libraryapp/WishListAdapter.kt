package com.example.libraryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class WishListAdapter  (private var wishBook : ArrayList<WishBook>) :  RecyclerView.Adapter<WishListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WishListAdapter.ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.wishbook_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wishBook.size
    }

    override fun onBindViewHolder(holder: WishListAdapter.ListViewHolder, position: Int) {
        val wishbook = wishBook[position]
        Glide.with(holder.itemView.context)
            .load(wishbook.cover)
            .apply(RequestOptions().override(55, 55))
            .into(holder.wishCover)
        holder.wishTitle.text = wishbook.title
        holder.wishWriter.text = wishbook.writer

    }


    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var wishTitle: TextView = itemView.findViewById(R.id.wish_title)
        var wishWriter: TextView = itemView.findViewById(R.id.wish_writer)
        var wishCover: ImageView = itemView.findViewById(R.id.wish_cover)
    }

}