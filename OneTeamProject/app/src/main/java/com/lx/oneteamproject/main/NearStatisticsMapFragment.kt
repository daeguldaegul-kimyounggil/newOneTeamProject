package com.lx.oneteamproject.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.lx.oneteamproject.databinding.NearStatiticsMapFragmentBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener


class NearStatisticsMapFragment : Fragment() {

    private var _binding: NearStatiticsMapFragmentBinding? = null
    private val binding get() = _binding!!

    var listener: OnFragmentListener? = null

    private fun replaceFragment(fragment: Fragment, transaction: FragmentTransaction) {
        transaction.replace(com.lx.oneteamproject.R.id.NearStatiticsFragmentMap, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NearStatiticsMapFragmentBinding.inflate(inflater, container, false)

        binding.statiticsBackButton.setOnClickListener {
            listener?.onFragmentChanged(FragmentType.MAIN)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSocial = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSocial)
        val btnRisk = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsRisk)
        val btnNatural = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsNatural)
        val btnSafety = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSafety)

        btnSocial.setOnClickListener {
            replaceFragment(NearSocialdisterFragment(), childFragmentManager.beginTransaction())
        }
        btnRisk.setOnClickListener {
            replaceFragment(NearRiskInformationFragment(), childFragmentManager.beginTransaction())
        }
        btnNatural.setOnClickListener {
            replaceFragment(NearNaturalDisaterFragment(), childFragmentManager.beginTransaction())
        }
        btnSafety.setOnClickListener {
            replaceFragment(
                NearSafetyFacilityInfoormationFragment(),
                childFragmentManager.beginTransaction()
            )
        }
    }

    override fun onResume() {
        super.onResume()

        val btnSocial = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSocial)
        val btnRisk = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsRisk)
        val btnNatural = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsNatural)
        val btnSafety = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSafety)

        val selectedButton = arguments?.getString("selectedButton")
        Log.d("SelectedButton", "Button: $selectedButton")
        when (selectedButton) {
            "social" -> {
                Log.d("SelectedButton", "Social button is clicked.")
                btnSocial.performClick()
            }

            "risk" -> {
                Log.d("SelectedButton", "Risk button is clicked.")
                btnRisk.performClick()
            }

            "natural" -> {
                Log.d("SelectedButton", "Natural button is clicked.")
                btnNatural.performClick()
            }

            "safety" -> {
                Log.d("SelectedButton", "Safety button is clicked.")
                btnSafety.performClick()
            }
        }

    }
}
