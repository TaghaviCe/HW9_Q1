package com.example.hw9_q1

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw9_q1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
   lateinit var binding:FragmentHomeBinding
    //lateinit var fav: MenuItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(CheckProfile.a=="true") {
            binding.imageButton1.setOnClickListener {
                binding.imageButton1.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(1, R.drawable.pic_b))

            }
            binding.imageButton2.setOnClickListener {
                binding.imageButton2.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(2, R.drawable.pic_c))
            }
            binding.imageButton3.setOnClickListener {
                binding.imageButton3.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(3, R.drawable.pic_b))
            }
            binding.imageButton4.setOnClickListener {
                binding.imageButton4.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(4, R.drawable.pic_d))
            }
            binding.imageButton5.setOnClickListener {
                binding.imageButton5.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(5, R.drawable.pic_e))
            }
            binding.imageButton6.setOnClickListener {
                binding.imageButton6.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(6, R.drawable.pic_s))
            }
            binding.imageButton7.setOnClickListener {
                binding.imageButton7.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(7, R.drawable.pic_q))
            }
            binding.imageButton8.setOnClickListener {
                binding.imageButton8.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(8, R.drawable.pic_t))
            }
            binding.imageButton9.setOnClickListener {
                binding.imageButton9.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(9, R.drawable.pic_c))
            }
            binding.imageButton10.setOnClickListener {
                binding.imageButton10.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(10, R.drawable.pic_z))
            }
            binding.imageButton11.setOnClickListener {
                binding.imageButton11.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(11, R.drawable.two))
            }
            binding.imageButton12.setOnClickListener {
                binding.imageButton12.setImageResource(android.R.drawable.btn_star_big_on)
                ListOFFilm.addFilm(Film(12, R.drawable.pic_g))
            }
        }else{
            Toast.makeText(activity,"please complete the profile first and save your information.",Toast.LENGTH_LONG).show()
        }

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.favorite -> {
                findNavController().navigate(R.id.action_homeFragment_to_favoriteFragment)
                true
            }
            R.id.coming_soon -> {
                findNavController().navigate(R.id.action_homeFragment_to_comingSoonFragment)
                true
            }
            R.id.profile -> {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    private fun goToNextFragment() {
        findNavController().navigate(R.id.action_homeFragment_to_favoriteFragment )
    }
}