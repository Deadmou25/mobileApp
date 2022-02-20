package com.example.mobileapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileapp.Model.Movie
import com.example.mobileapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout.view.*

class MyMovieAdapter(private val context: Context,private val movieList: MutableList<Movie>):RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.image_movie
        val name: TextView = itemView.txt_createdby
        val team: TextView = itemView.txt_team
        val createdby: TextView = itemView.txt_createdby

        fun bind(listItem: Movie) {
            image.setOnClickListener {
                Toast.makeText(it.context, "нажал на ${itemView.image_movie}", Toast.LENGTH_SHORT)
                    .show()
            }
            itemView.setOnClickListener {
                Toast.makeText(it.context, "нажал на ${name.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)

        Picasso.get().load(movieList[position].imageurl).into(holder.image)
        holder.name.text = movieList[position].name
        holder.team.text = movieList[position].team
        holder.createdby.text = movieList[position].createdby
    }

}