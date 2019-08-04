package com.aphruedite.timeanalysis

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.question1.*

class Question1 : MainActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.question1)

       


        btnnext1.setOnClickListener {


            val intent = Intent(this, Question2::class.java)

            mApp.time2 = System.nanoTime()



            startActivity(intent)





        }


    }

}
