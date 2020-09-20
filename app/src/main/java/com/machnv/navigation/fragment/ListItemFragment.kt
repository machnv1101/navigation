package com.machnv.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.machnv.navigation.R
import com.machnv.navigation.adpater.ListAdapter
import com.machnv.navigation.databinding.FragmentListItemBinding
import com.machnv.navigation.viewmodel.ListItemViewModel

class ListItemFragment : Fragment(), ListAdapter.ItemProductClickListener {

    private var listAdapter = ListAdapter()

    private val viewModel: ListItemViewModel by lazy {
        ViewModelProvider(this)[ListItemViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentListItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_list_item, container, false)

        binding.viewModel = viewModel

        binding.rvListItem.setHasFixedSize(true)
        binding.rvListItem.layoutManager = LinearLayoutManager(requireContext())
        binding.rvListItem.adapter = listAdapter

        listAdapter.listItem = viewModel.createListItem()
        listAdapter.setOnItemClickListener(this)

        return binding.root
    }

    override fun onItemProductClick(position: Int) {
        findNavController().navigate(
            ListItemFragmentDirections.actionListItemToDetailItem(item = listAdapter.listItem[position])
        )
    }
}