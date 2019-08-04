package com.aphruedite.timeanalysis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var mApp = Timestamps()

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnstart.setOnClickListener {


            val intent = Intent(this, Question1::class.java)

            mApp.time1 = System.nanoTime()

            startActivity(intent)



        }


    }



    }
