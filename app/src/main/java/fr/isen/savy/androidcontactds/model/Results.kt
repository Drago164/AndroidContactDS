package fr.isen.savy.androidcontactds.model

import com.google.gson.annotations.SerializedName

public class Results (
    @SerializedName("gender" ) var gender : String?               = null,
    @SerializedName("name" ) var name : ArrayList<NameItems>      = arrayListOf(),
    @SerializedName("location" ) var location : ArrayList<LocationsItems>?      = arrayListOf(),
    @SerializedName("email" ) var email : String?               = null,
    @SerializedName("login" ) var login : ArrayList<LoginItems>?      = arrayListOf(),
    @SerializedName("dob" ) var dob : ArrayList<DobItems>?      = arrayListOf(),
    @SerializedName("registered" ) var registered : ArrayList<RegisteredItems>?      = arrayListOf(),
    @SerializedName("phone" ) var phone : String?               = null,
    @SerializedName("cell" ) var cell : String?               = null,
    @SerializedName("id" ) var id : ArrayList<IdItems>?      = arrayListOf(),
    @SerializedName("picture" ) var picture : ArrayList<PictureItems>?      = arrayListOf(),
    @SerializedName("nat" ) var nat : String?               = null,

    )
