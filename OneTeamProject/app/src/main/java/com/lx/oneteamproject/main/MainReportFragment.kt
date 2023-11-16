package com.lx.oneteamproject.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.FragmentMainReportBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener

class MainReportFragment : Fragment() {

    var _binding: FragmentMainReportBinding? = null
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
        _binding = FragmentMainReportBinding.inflate(inflater, container, false)

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        val reportfreefragment = MainReportFreeFragment()
        val containerId = R.id.mainReportContainer

        transaction.replace(containerId, reportfreefragment)
        transaction.addToBackStack(null)
        transaction.commit()

        // 신고하기 버튼 눌렀을 때
        binding.reportButton.setOnClickListener{
            listener?.onFragmentChanged(FragmentType.REPORTCHECK)
        }

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