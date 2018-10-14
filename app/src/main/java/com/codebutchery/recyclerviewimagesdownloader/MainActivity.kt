package com.codebutchery.recyclerviewimagesdownloader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvImages.layoutManager = LinearLayoutManager(this)
        rvImages.adapter = ImagesAdapter(this)
    }

    override fun onDestroy() {
        rvImages.adapter = null
        super.onDestroy()
    }
}