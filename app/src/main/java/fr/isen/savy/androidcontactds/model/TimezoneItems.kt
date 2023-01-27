package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class TimezoneItems (
        @SerializedName("offset" ) var offset : String?               = null,
        @SerializedName("description" ) var description : String?               = null,
)