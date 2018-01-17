package com.defaultapps.cryptocurrency.view.overview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.defaultapps.cryptocurrency.R
import com.defaultapps.cryptocurrency.data.entity.Currency
import kotlinx.android.synthetic.main.item_currency.view.*

class OverviewAdapter : RecyclerView.Adapter<CurrencyViewHolder>() {

    private val items = mutableListOf<Currency>()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CurrencyViewHolder {
        val view =  LayoutInflater.from(parent!!.context).inflate(R.layout.item_currency, parent, false)
        return CurrencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder?, position: Int) {
        val aPosition = holder!!.adapterPosition
        holder.itemView.currencyName.text = items[aPosition].name
    }

    override fun getItemCount(): Int = items.size

    fun setData(items: List<Currency>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}