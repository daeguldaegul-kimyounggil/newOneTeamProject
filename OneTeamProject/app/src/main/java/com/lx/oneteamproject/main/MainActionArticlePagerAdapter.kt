package com.lx.oneteamproject.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lx.oneteamproject.R

class MainActionArticlePagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    val images = arrayListOf<Int>(R.drawable.article1_2, R.drawable.article1_2, R.drawable.article1_3, R.drawable.article2_1, R.drawable.article2_2, R.drawable.article2_3)

    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        var fragment = MainActionArticlePagerItemFragment()

        fragment.arguments = Bundle().apply {
            putInt("position", position)
            putInt("image", images[position])
        }

        return fragment
    }
}