package com.marcelo.postsretrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.marcelo.postsretrofit.R
import com.marcelo.postsretrofit.model.PostModel

class PostAdapter( val postModel:MutableList<PostModel> ):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_posts,parent,false)
        return PostViewHolder(layout)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postModel[position])
    }

    override fun getItemCount(): Int {
        return postModel.size
    }
}

class PostViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    private val tvPostTitle :TextView=itemView.findViewById(R.id.tvPostTitle)
    private val tvPostBody :TextView=itemView.findViewById(R.id.tvPostBody)


    fun bindView(postModel:PostModel){
        tvPostTitle.text = postModel.title
        tvPostBody.text = postModel.body
    }

}