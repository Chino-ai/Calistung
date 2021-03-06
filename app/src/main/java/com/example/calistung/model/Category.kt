package com.example.calistung.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    @field:SerializedName("name")
    val name:String?=null,
    @field:SerializedName("learnCategories")
    val learnCategories: LearnCategory?=null,
    @field:SerializedName("trainCategories")
    val trainCategories: TrainCategory?=null,
):Parcelable
