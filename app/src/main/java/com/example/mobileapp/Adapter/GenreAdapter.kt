package com.example.mobileapp.Adapter
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class GenreAdapter: RecyclerView.Adapter<GenreAdapter.GenreViewHolder>() {
    var genreList: List<String> = listOf("comedy","dram","action movie");
    open class GenreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }

    fun getArrayElement(list:List<String>){
        for(item in list){
           println(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    open override fun getItemCount(): Int {
        return 0
    }
}


