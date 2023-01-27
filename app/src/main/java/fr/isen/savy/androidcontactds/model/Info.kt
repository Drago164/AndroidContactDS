package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class Info (
        @SerializedName("seed" ) var seed : String?               = null,
        @SerializedName("results" ) var results : String?               = null,
        @SerializedName("page" ) var page : String?               = null,
        @SerializedName("version" ) var version : String?               = null,
        )