package com.eric.mycamera

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val CAMERA_BACK=10021
    val CAMERA_CUT_BACK=10022
    val CAMERA_CUSTOM_BACK=10023



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_camera.setOnClickListener {






        }

    }



}
