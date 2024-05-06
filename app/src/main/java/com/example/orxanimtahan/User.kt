package com.example.orxanimtahan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var name:String,var secim:Int,var foto:Int):Parcelable {

}