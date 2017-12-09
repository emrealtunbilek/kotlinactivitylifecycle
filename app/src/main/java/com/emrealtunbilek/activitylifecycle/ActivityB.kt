package com.emrealtunbilek.activitylifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Emre on 9.12.2017.
 */
class ActivityB : AppCompatActivity() {

    val TAG = "EMRE actıvıty b"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.e(TAG, "onCreate:")

    }
}