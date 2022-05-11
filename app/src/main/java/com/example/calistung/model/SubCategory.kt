package com.example.calistung.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SubCategory(
    val name:String?=null,
    val trainCourse: ArrayList<TrainCourse>?=null,
    val learnCourse:ArrayList<LearnCourse>?=null
):Parcelable