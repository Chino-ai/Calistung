package com.example.calistung.ui.belajar.daftar_isi_belajar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.calistung.model.LearnCourse

class DaftarIsiBelajarViewModel: ViewModel() {
    private val _learnCourses = MutableLiveData<LearnCourse>()
    val learnCourses
        get() = _learnCourses
    fun setLearnCourses(learnCourse: LearnCourse){
        _learnCourses.value=learnCourse
    }
}