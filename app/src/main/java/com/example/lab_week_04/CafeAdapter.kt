package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

// Ganti konstruktor agar menerima Fragment sebagai parameter
class CafeAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val content = when (position) {
            0 -> fragment.resources.getString(R.string.starbucks_desc)
            1 -> fragment.resources.getString(R.string.janjijiwa_desc)
            2 -> fragment.resources.getString(R.string.kopikenangan_desc)
            else -> ""
        }
        return CafeDetailFragment.newInstance(content)
    }
}