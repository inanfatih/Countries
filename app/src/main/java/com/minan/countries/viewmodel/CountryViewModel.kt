package com.minan.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minan.countries.model.Country

class CountryViewModel: ViewModel() {
    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom()
    {
        val country = Country("Turkey", "Ankara", "Asia", "TRY", "Turkish", "www.google.com")
        countryLiveData.value = country
    }
}