package com.example.todomateclone.ui.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.todomateclone.R
import com.example.todomateclone.databinding.FragmentChangeEmailBinding
import com.example.todomateclone.viewmodel.UserViewModel

class ChangeEmailFragment : Fragment() {

    private val userViewModel: UserViewModel by viewModel()
    private var _binding: FragmentChangeEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_change_email, container, false)
    }
}