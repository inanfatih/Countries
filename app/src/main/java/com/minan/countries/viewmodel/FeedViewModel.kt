package com.minan.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minan.countries.model.Country

class FeedViewModel: ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData()
    {
        val country = Country("Turkey", "Asia", "Ankara", "TRY", "Turkish", "www.google.com")
        val country2 = Country("France", "Europe", "Paris", "EUR", "French", "www.google.com")
        val country3 = Country("Germany", "Europe", "Berlin", "EUR", "Berlin", "www.google.com")

        val countryList = arrayListOf(country, country2, country3)
        countries.value = countryList
        countryLoading.value = false
        countryError.value = false
    }
}