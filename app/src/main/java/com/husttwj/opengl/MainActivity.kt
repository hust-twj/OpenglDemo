package com.husttwj.opengl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.husttwj.opengl.triangle.MyGLSurfaceView

class MainActivity : AppCompatActivity() {

    private var mGLSurfaceView: MyGLSurfaceView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        //实例化对象
        mGLSurfaceView = MyGLSurfaceView(this)
        setContentView(mGLSurfaceView);
    }
}