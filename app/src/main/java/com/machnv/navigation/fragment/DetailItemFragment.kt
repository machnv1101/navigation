package com.machnv.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.machnv.navigation.R
import com.machnv.navigation.databinding.FragmentDetailItemBinding
import com.machnv.navigation.viewmodel.DetailItemViewModel

class DetailItemFragment : Fragment() {

    private val viewModel: DetailItemViewModel by lazy {
        ViewModelProvider(this)[DetailItemViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDetailItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_detail_item, container, false)

        binding.viewModel = viewModel

        val args = arguments?.let {
            DetailItemFragmentArgs.fromBundle(it)
        }
        args?.let {
            viewModel.setData(it.item)
        }

        return binding.root
    }
}