package com.example.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE

// Android extensions import statements for the two views to update
import com.example.test.R
import com.example.test.R.id.imageView
import com.example.test.R.layout.activity_main
import java.util.*

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }
}
