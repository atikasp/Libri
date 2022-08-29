package com.example.libraryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter (private var listBook : ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]
        Glide.with(holder.itemView.context)
            .load(book.cover)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgCover)
        holder.tvTitle.text = book.title
        holder.tvType.text = book.type
        holder.tvWriter.text = book.writer
        holder.tvDescription.text = book.description
        holder.ratebar.rating = book.rateBar
        holder.rateValue.text = book.rateValue.toString()

        holder.initialize(listBook[position], onItemClickCallback)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBook[holder.adapterPosition])
        }

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_book_title)
        var tvType : TextView = itemView.findViewById(R.id.tv_book_type)
        var tvWriter: TextView = itemView.findViewById(R.id.tv_book_writer)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_description)
        var imgCover: ImageView = itemView.findViewById(R.id.cover_book)
        var ratebar: RatingBar = itemView.findViewById(R.id.ratingBar)
        var rateValue: TextView = itemView.findViewById(R.id.rateValue)

        fun initialize(item: Book, action: OnItemClickCallback) {
            tvTitle.text = item.title
            tvType.text = item.type
            tvWriter.text = item.writer
            tvDescription.text = item.description
            ratebar.rating = item.rateBar
            rateValue.text = item.rateValue.toString()
            imgCover.setImageResource(item.cover)

            itemView.setOnClickListener{
                action.onItemClicked(item)
            }
        }

    }

    fun updateList(list : MutableList<Book>) {
        listBook = list as ArrayList<Book>
        notifyDataSetChanged()
    }



}


