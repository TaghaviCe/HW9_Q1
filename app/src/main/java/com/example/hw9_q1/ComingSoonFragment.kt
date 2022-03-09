package com.example.hw9_q1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw9_q1.databinding.FragmentComingSoonBinding

class ComingSoonFragment : Fragment() {
    lateinit var binding: FragmentComingSoonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComingSoonBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_coming_soon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button11.setOnClickListener {
            var text = binding.textView1.text.toString()
            shareButton(text)

        }
        binding.button22.setOnClickListener {
            var text = binding.textView2.text.toString()
            shareButton(text)
        }
        binding.button33.setOnClickListener {
            var text = binding.textView3.text.toString()
            shareButton(text)
        }
    }

    fun shareButton(text: String) {
       var intent=Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT,text)
        intent.type="text/plain"
        startActivity(Intent.createChooser(intent,"Share To:"))

    }
}
