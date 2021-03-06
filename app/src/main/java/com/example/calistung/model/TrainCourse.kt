package com.example.calistung.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrainCourse(
    @field:SerializedName("name")
    val name:String?=null,
    @field:SerializedName("trainQuestion")
    val trainQuestion: ArrayList<TrainQuestion>?=null
): Parcelable
