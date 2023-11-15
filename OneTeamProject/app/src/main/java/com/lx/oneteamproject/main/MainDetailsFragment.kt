package com.lx.oneteamproject.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.FragmentMainDetailsBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener

class MainDetailsFragment : Fragment() {

    var _binding: FragmentMainDetailsBinding? = null
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
        _binding = FragmentMainDetailsBinding.inflate(inflater, container, false)

        binding.mainActionArticlePager.adapter =
            MainActionArticlePagerAdapter(requireActivity().supportFragmentManager, lifecycle)

        binding.situationButton.setOnClickListener {
            // NEARSITUATIONMAP 프래그먼트로 전환
            listener?.onFragmentChanged(FragmentType.NEARSITUATIONMAP)

        }

        binding.socialButton.setOnClickListener {
            // NEARSTATISTICSMAP_SOCIAL 프래그먼트로 전환
            listener?.onFragmentChanged(FragmentType.NEARSTATISTICSMAP_SOCIAL)
        }

        binding.riskButton.setOnClickListener {
            // NEARSTATISTICSMAP_RISK 프래그먼트로 전환
            listener?.onFragmentChanged(FragmentType.NEARSTATISTICSMAP_RISK)
        }

        binding.naturalButton.setOnClickListener {
            // NEARSTATISTICSMAP_NATURAL 프래그먼트로 전환
            listener?.onFragmentChanged(FragmentType.NEARSTATISTICSMAP_NATURAL)
        }

        binding.safetyButton.setOnClickListener {
            // NEARSTATISTICSMAP_SAFETY 프래그먼트로 전환
            listener?.onFragmentChanged(FragmentType.NEARSTATISTICSMAP_SAFETY)
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