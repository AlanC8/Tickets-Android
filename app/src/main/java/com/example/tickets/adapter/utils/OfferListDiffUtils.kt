package com.example.tickets.adapter.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.tickets.model.entity.Offer

class OfferListDiffUtils(
    private val oldList: List<Offer>,
    private val newList: List<Offer>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].id == newList[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition] == newList[newItemPosition]
}