package com.lx.oneteamproject.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.FragmentReportCheckImagePagerItemBinding
import com.lx.oneteamproject.fragment.OnFragmentListener

class ReportCheckImagePagerItemFragment : Fragment() {

    var _binding: FragmentReportCheckImagePagerItemBinding? = null
    val binding get() = _binding!!

    lateinit var reportimagelistadapter: ReportImageListAdapter

    var listener: OnFragmentListener? = null

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

        if (activity is OnFragmentListener) {
            listener = activity as OnFragmentListener
        }
    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentReportCheckImagePagerItemBinding.inflate(inflater, container, false)

        reportimagelistadapter = ReportImageListAdapter()
        binding.imageList.adapter = reportimagelistadapter

        reportimagelistadapter.listener = object : OnReportImageListItemClickListener {
            override fun onReportImageListItemClick(
                holder: ReportImageListAdapter.ViewHolder,
                view: View?,
                position: Int
            ) {
                val item = reportimagelistadapter.reportimagelist[position]
            }
        }

        reportimagelistadapter.reportimagelist.add(ReportImageListItem(R.drawable.sample_report))

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.apply {
            val position = getInt("position", -1)

            val image = getInt("image")

            val imageList = ArrayList<ReportImageListItem>()
            imageList.add(ReportImageListItem(image))

            val adapter = ReportImageListAdapter()
            adapter.reportimagelist = imageList
            binding.imageList.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()

        listener = null
    }
}