package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

class LocationsItems (
    @SerializedName("street" ) var street : ArrayList<StreetItems> = arrayListOf(),
    @SerializedName("city" ) var city : String?               = null,
    @SerializedName("state" ) var state : String?               = null,
    @SerializedName("country" ) var country : String?               = null,
    @SerializedName("postcode" ) var postcode : String?               = null,
    @SerializedName("coordinates" ) var coordinates : ArrayList<CoordinatesItems> = arrayListOf(),
    @SerializedName("timezone" ) var timezone : ArrayList<TimezoneItems> = arrayListOf(),

    )
