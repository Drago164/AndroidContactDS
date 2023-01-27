package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class StreetItems (
    @SerializedName("number" ) var number : String?     = null,
    @SerializedName("name" ) var name : String?               = null,
)