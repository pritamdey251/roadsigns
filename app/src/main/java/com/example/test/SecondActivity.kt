package com.example.test

// Android extensions import statements for the two views to update
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.test.R.layout.activity_main

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }
}
