package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

data class DataResult (
    @SerializedName("data" ) var data : ArrayList<Data> = arrayListOf()
)
