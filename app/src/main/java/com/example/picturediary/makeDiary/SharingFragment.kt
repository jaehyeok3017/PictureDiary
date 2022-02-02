package com.example.picturediary.makeDiary

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.picturediary.R
import com.example.picturediary.databinding.FragmentSharingBinding
import com.example.picturediary.databinding.FragmentWritingBinding


class SharingFragment : Fragment() {

    private lateinit var makeDiaryActivity: MakeDiaryActivity
    private lateinit var _binding : FragmentSharingBinding
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        makeDiaryActivity = context as MakeDiaryActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSharingBinding.inflate(inflater, container, false)
        binding.sharingCloseBtn.setOnClickListener {
            makeDiaryActivity!!.openFragmentOnFrameLayout(3)
        }
        return binding.root
    }

}