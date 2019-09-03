package com.example.mvvmcopy.tasks

import androidx.test.filters.LargeTest
import androidx.test.runner.AndroidJUnit4
import com.example.mvvmcopy.DaggerTestApplicationRule
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class AppNavigationTest {

    @get:Rule
    val rule = DaggerTestApplicationRule()

}