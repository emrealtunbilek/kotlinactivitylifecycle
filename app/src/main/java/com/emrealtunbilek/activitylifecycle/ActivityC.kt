package com.emrealtunbilek.activitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by Emre on 9.12.2017.
 */
class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.e("EMRE", "ACTIVITY C onCreate:")
    }
}