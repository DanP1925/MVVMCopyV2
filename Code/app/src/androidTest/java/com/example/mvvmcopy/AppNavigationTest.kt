package com.example.mvvmcopy

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class AppNavigationTest {

    @get:Rule
    val rule = DaggerTestApplicationRule()

    @Test
    fun drawerNavigationFromTasksToStatistics(){

        val activityScenario = ActivityScenario.launch(TasksActivity::class.java)

    }

}