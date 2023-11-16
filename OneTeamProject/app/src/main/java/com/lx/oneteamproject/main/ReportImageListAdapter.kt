package com.lx.oneteamproject.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lx.oneteamproject.databinding.ReportCheckImageListItemBinding

class ReportImageListAdapter : RecyclerView.Adapter<ReportImageListAdapter.ViewHolder>() {

    var reportimagelist = ArrayList<ReportImageListItem>()

    lateinit var listener: OnReportImageListItemClickListener

    override fun getItemCount(): Int = reportimagelist.size

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ReportImageListAdapter.ViewHolder {
        val binding = ReportCheckImageListItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val reportitem = reportimagelist[position]
        holder.setItem(reportitem)
    }

    inner class ViewHolder(val binding: ReportCheckImageListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                listener.onReportImageListItemClick(this, binding.root, adapterPosition)
            }
        }

        fun setItem(reportimages: ReportImageListItem) {

            Glide.with(binding.reportImage.context).load(reportimages.reportImage).into(binding.reportImage)

        }
    }
}