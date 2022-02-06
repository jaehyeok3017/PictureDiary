package com.example.picturediary.makeDiary.Drawing

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.picturediary.R
import com.example.picturediary.databinding.FragmentDrawingBinding
import com.example.picturediary.makeDiary.MakeDiaryActivity

class DrawingFragment : Fragment() {

    private lateinit var makeDiaryActivity: MakeDiaryActivity
    private lateinit var canvasView: CanvasView
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

