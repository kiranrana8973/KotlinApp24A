package com.kiran.kotlinapp24a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {
    private lateinit var rdoMiniBhuwan : RadioButton
    private lateinit var imgProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rdoMiniBhuwan = findViewById(R.id.rdoMiniBhuwan)
        imgProfile = findViewById(R.id.imgProfile)

        rdoMiniBhuwan.setOnClickListener {
            imgProfile.setImageResource(R.drawable.minibhuwankc)
        }

    }
}