package com.example.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import java.util.*

/**
 * Class to create main view and transition to the second random view
 */
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Choose a random view from all the available views
     */
    fun randomMe (view: View)
    {
        val layouts = intArrayOf(R.layout.no_motorcycles, R.layout.no_parking, R.layout.yield,
                R.layout.do_not_enter, R.layout.stop)
        setContentView(layouts[Random().nextInt(layouts.size)])
    }
}
