package com.example.picturediary.makeDiary

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.picturediary.R
import com.example.picturediary.databinding.FragmentDrawingBinding
import com.example.picturediary.databinding.FragmentWritingBinding


class WritingFragment : Fragment() {

    private lateinit var makeDiaryActivity: MakeDiaryActivity
    private lateinit var _binding : FragmentWritingBinding
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        makeDiaryActivity = context as MakeDiaryActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWritingBinding.inflate(inflater, container, false)
        binding.writingFinBtn.setOnClickListener {
            makeDiaryActivity!!.openFragmentOnFrameLayout(2)
        }
        return binding.root
    }
}