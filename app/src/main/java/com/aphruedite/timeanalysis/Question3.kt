package com.aphruedite.timeanalysis

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.question3.*

class Question3 : MainActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.question3)

        btnnext3.setOnClickListener {


            val intent = Intent(this, Result::class.java)

            mApp.time4 = System.nanoTime()


            startActivity(intent)



        }



    }


}
