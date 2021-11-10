package com.minan.countries.model

import com.google.gson.annotations.SerializedName

data class Country(
    // Comment edilmis olan property lerin ismi gelecek JSON'da da ayni oldugundan dolayi @SerializedName eklemeye gerek yok
    // @SerializedName("name")
    val name: String?,

    // @SerializedName("capital")
    val capital: String?,

    // @SerializedName("region")
    val region: String?,

    // @SerializedName("currency")
    val currency: String?,

    // @SerializedName("language")
    val language: String?,

    @SerializedName("flag")
    val imageUrl: String?
    )