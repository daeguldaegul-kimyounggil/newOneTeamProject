package com.lx.oneteamproject.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lx.oneteamproject.fragment.OnFragmentListener
import androidx.fragment.app.Fragment
import com.lx.oneteamproject.databinding.FragmentReportCheckPopupBinding

class ReportCheckPopUpFragment : Fragment(){

    var _binding: FragmentReportCheckPopupBinding? = null
    val binding get() = _binding!!

    var listener: OnFragmentListener? = null

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

        if (activity is OnFragmentListener) {
            listener = activity as OnFragmentListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReportCheckPopupBinding.inflate(inflater, container, false)

        binding.reportImageOutput.adapter = ReportFreeImagePagerAdapter(requireActivity().supportFragmentManager, lifecycle)

        return binding.root
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