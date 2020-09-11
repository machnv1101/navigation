package com.machnv.navigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.machnv.navigation.R
import com.machnv.navigation.data.Item
import kotlinx.android.synthetic.main.fragment_list_item.*

class ListItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnOpenDetailItem.setOnClickListener {
            findNavController().navigate(
                ListItemFragmentDirections.actionListItemToDetailItem(Item(11, "Value Name Item"))
            )
        }
    }
}