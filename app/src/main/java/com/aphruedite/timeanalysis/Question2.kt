package com.aphruedite.timeanalysis

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.question2.*

class Question2 : MainActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.question2)

        btnnext2.setOnClickListener {


            val intent= Intent(this, Question3::class.java)

            mApp.time3 = System.nanoTime()


            startActivity(intent)





        }




    }


}
