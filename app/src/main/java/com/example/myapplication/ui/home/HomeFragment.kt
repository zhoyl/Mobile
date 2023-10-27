package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.myapplication.FeelRecycler
import com.example.myapplication.MyFeel
import com.example.myapplication.MyState
import com.example.myapplication.R
import com.example.myapplication.StateRecycler
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val feel_recycler:RecyclerView=root.findViewById((R.id.feel_rec))
        feel_recycler.adapter=FeelRecycler(requireContext(), MyFeel().list)

        val state_rec:RecyclerView=root.findViewById(R.id.state_Rec)
        state_rec.adapter= StateRecycler(requireContext(),MyState().state_list)


        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}