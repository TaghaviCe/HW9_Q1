package com.example.hw9_q1

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw9_q1.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_profile, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val sharedPreferences: SharedPreferences =
            this.requireActivity().getSharedPreferences("myInformation", Context.MODE_PRIVATE)
        binding.buttonSave.setOnClickListener {
            var name1 = binding.editTextPersonName.text.toString()
            var username1 = binding.userName.text.toString()
            var email1 = binding.Email.text.toString()
            var password1 = binding.password.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("name", name1)
            editor.putString("username", username1)
            editor.putString("email", email1)
            editor.putString("password", password1)
            editor.apply()
            editor.commit()
            Toast.makeText(activity, "your information was saved!", Toast.LENGTH_SHORT).show()
            CheckProfile.a="true"
        }
    }
}