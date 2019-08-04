package com.aphruedite.timeanalysis

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.result.*


class Result : MainActivity(){

    var res : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val a: Long? = (mApp.time2 - mApp.time1) /1000000000
        val b: Long? = (mApp.time3 - mApp.time2) /1000000000
        val c: Long? = (mApp.time4 - mApp.time3) /1000000000


        resview1.text = ("\n The time taken to answer question 1 is : $a seconds\n \n" +
                " The time taken to answer question 2 is : $b seconds\n\n" +
                " The time taken to answer question 3 is : $c seconds\n")


        btnretry.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java)


            startActivity(intent)


        }


    }


}





