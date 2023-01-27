package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class PictureItems (
        @SerializedName("large" ) var large : String?               = null,
        @SerializedName("medium" ) var medium : String?               = null,
        @SerializedName("thumbnail" ) var thumbnail : String?               = null,
)
