package com.example.orxanimtahan

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var nameWork:String,var secim:Boolean,@DrawableRes var foto:Int):Parcelable {

}