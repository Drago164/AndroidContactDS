package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class IdItems (
    @SerializedName("name" ) var name : String?               = null,
    @SerializedName("value" ) var value : String?               = null,
)
