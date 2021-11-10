package com.minan.countries.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.minan.countries.R
import com.minan.countries.adapter.CountryAdapter.CountryViewHolder
import com.minan.countries.databinding.ItemCountryBinding
import com.minan.countries.model.Country
import com.minan.countries.util.downloadFromUrl
import com.minan.countries.util.placeholderProgressBar
import com.minan.countries.view.FeedFragmentDirections

class CountryAdapter(val countryList: ArrayList<Country>): RecyclerView.Adapter<CountryViewHolder>() {

    class CountryViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemCountryBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.binding.name.text = countryList[position].name
        holder.binding.region.text = countryList[position].region

        holder.view.setOnClickListener{
            val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
            Navigation.findNavController(it).navigate(action)
        }

        holder.binding.imageView.downloadFromUrl(countryList[position].imageUrl, placeholderProgressBar(holder.view.context))
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    fun updateCountryList(newCountryList: List<Country>)
    {
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }
}