package com.ahozyainov.cloudshare.view.fragment.search

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import com.ahozyainov.cloudshare.R.layout.image_recycler_search as imageRecyclerSearch

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val imageView = SearchViewHolder(LayoutInflater.from(parent.context)
                .inflate(imageRecyclerSearch, parent, false) as ImageView)
        return imageView
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class SearchViewHolder(val imageView: ImageView) : RecyclerView.ViewHolder(imageView)
}