package com.emrealtunbilek.activitylifecycle

//Activity Life Cycle örnek

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.content.Intent
import android.support.annotation.Nullable
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val TAG = "EMRE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.e(TAG, "onCreate:")

        if (savedInstanceState != null) {
            val value = savedInstanceState.getCharSequence("key")
            input!!.text = value
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: ")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ")
    }



    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

    fun launchActivity(view: View) {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }

    fun launchDialog(view: View) {
        launchDialogFragment()
    }

    fun launchDialogAlert() {
        AlertDialog.Builder(this)
                .setMessage(R.string.hello_c)
                .show()
    }

    fun launchDialogFragment() {
        val myDialog = MyDialog()
        myDialog.show(supportFragmentManager, "my_dialog")
    }

    fun increment(view: View) {
        val string = input.text.toString()
        if (string != null && !string.isEmpty()) {
            var value = Integer.parseInt(string)
            value += 1
            input.text = value.toString() + ""
        }
    }

    class MyDialog : DialogFragment() {
        @Nullable
        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val textView = TextView(getActivity())
            textView.setText(R.string.hello_c)
            textView.setTextColor(getResources().getColor(R.color.white))
            textView.setBackgroundColor(getResources().getColor(R.color.black))
            return textView
        }
    }
}
