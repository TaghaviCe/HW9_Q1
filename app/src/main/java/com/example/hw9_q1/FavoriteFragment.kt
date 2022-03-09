package com.example.hw9_q1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw9_q1.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {
    lateinit var binding: FragmentFavoriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFavoriteBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        for (i in 0 until ListOFFilm.myList.size){
            var a=ListOFFilm.myList[i].name
            when(a){
                1-> binding.imageView1.setImageResource(ListOFFilm.myList[i].image)
                2->binding.imageView2.setImageResource(ListOFFilm.myList[i].image)
                3->binding.imageView3.setImageResource(ListOFFilm.myList[i].image)
                4->binding.imageView4.setImageResource(ListOFFilm.myList[i].image)
                5->binding.imageView5.setImageResource(ListOFFilm.myList[i].image)
                6->binding.imageView6.setImageResource(ListOFFilm.myList[i].image)
                7->binding.imageView7.setImageResource(ListOFFilm.myList[i].image)
                8->binding.imageView8.setImageResource(ListOFFilm.myList[i].image)
                9->binding.imageView9.setImageResource(ListOFFilm.myList[i].image)
                10->binding.imageView10.setImageResource(ListOFFilm.myList[i].image)
                11->binding.imageView11.setImageResource(ListOFFilm.myList[i].image)
                12->binding.imageView12.setImageResource(ListOFFilm.myList[i].image)
                else-> Toast.makeText(activity,"error",Toast.LENGTH_LONG).show()
            }
        }
     //   super.onViewCreated(view, savedInstanceState)


    }
    }
