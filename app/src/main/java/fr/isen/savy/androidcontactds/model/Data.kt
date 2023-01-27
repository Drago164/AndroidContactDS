package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class Data (
    @SerializedName("result" ) var result : ArrayList<Results> = arrayListOf(),
    @SerializedName("info" ) var info : ArrayList<Info> = arrayListOf()
        ) {
}