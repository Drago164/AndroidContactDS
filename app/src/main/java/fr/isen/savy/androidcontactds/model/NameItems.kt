package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

public class NameItems (
    @SerializedName("Ms" ) var ms : String?               = null,
    @SerializedName("first" ) var first : String?         = null,
    @SerializedName("last" ) var last : String?           = null,
)