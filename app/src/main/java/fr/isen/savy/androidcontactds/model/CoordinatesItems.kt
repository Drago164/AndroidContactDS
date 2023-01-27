package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class CoordinatesItems (
        @SerializedName("latitude" ) var latitude : String?               = null,
        @SerializedName("longitude" ) var longitude : String?               = null,
)
