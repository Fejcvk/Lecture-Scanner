package com.vlk.fejcak.lecturescanner.Views

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import com.vlk.fejcak.lecturescanner.R

/**
 * Created by Tomek on 11/03/2018.
 */
class CameraViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera_activity)
        startCamera()
    }
    private fun startCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent);
    }
}