package com.example.tickets.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.tickets.R
import com.example.tickets.adapter.OfferListAdapter
import com.example.tickets.databinding.FragmentOfferListBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class OfferListFragment : Fragment() {

    companion object {
        fun newInstance() = OfferListFragment()
    }

    private var _binding: FragmentOfferListBinding? = null
    private val binding
        get() = _binding!!

    private val adapter: OfferListAdapter by lazy {
        OfferListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOfferListBinding.inflate(layoutInflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.IO) {
            try {
                val list = ApiClient.getApiService().getOffers()
                activity?.runOnUiThread { adapter.setItems(list) }
            } catch (e: Exception) {
                Log.e("Error-tag", e.message.toString())
            }
        }
    }

    private fun setupUI() {
        with(binding) {
            offerList.adapter = adapter

            sortRadioGroup.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.sort_by_price -> adapter.sortByPrice()

                    R.id.sort_by_duration -> adapter.sortByDuration()
                }
            }
        }
    }
}