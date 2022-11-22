package com.example.vitalya_anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val kot = findViewById<ImageView>(R.id.kot)

        b1.setOnClickListener {
            val sunImageView: ImageView = findViewById(R.id.sun)
            val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
            sunImageView.startAnimation(sunRiseAnimation)
        }
        b2.setOnClickListener {
            val clockImageView: ImageView = findViewById(R.id.clock)
            val clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
            clockImageView.startAnimation(clockTurnAnimation)
            val hourImageView: ImageView = findViewById(R.id.hour_hand)
            val hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
            hourImageView.startAnimation(hourTurnAnimation)
        }
        b3.setOnClickListener {
            kot.isVisible = true
        }
    }
}


