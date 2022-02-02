package com.example.picturediary.makeDiary

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.picturediary.R
import com.example.picturediary.databinding.ActivityMakeDiaryBinding
import com.example.picturediary.databinding.FragmentDrawingBinding

class DrawingFragment : Fragment() {

    private lateinit var makeDiaryActivity: MakeDiaryActivity
    private lateinit var _binding : FragmentDrawingBinding
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        makeDiaryActivity = context as MakeDiaryActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDrawingBinding.inflate(inflater, container, false)
        binding.drawingNxtBtn.setOnClickListener {
            makeDiaryActivity!!.openFragmentOnFrameLayout(1)
        }
        return binding.root
    }
}

