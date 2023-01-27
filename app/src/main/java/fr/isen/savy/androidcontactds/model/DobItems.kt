package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class DobItems (
    @SerializedName("date" ) var date : String?               = null,
    @SerializedName("age" ) var age : String?               = null,
    )
