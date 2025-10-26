package com.example.datn_mobile

import androidx.lifecycle.ViewModel
import javax.inject.Inject


class TestViewModel @Inject constructor(
    private val test : Test
) : ViewModel() {
    fun getUser() = test.getUserName()
}