package com.ahanaf.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val box_text_one: View = findViewById(R.id.box_one_text)
        val box_text_two: View = findViewById(R.id.box_two_text)
        val box_text_three: View = findViewById(R.id.box_three_text)
        val box_text_four: View = findViewById(R.id.box_four_text)
        val box_text_five: View = findViewById(R.id.box_five_text)
        val constraint_layout: View = findViewById(R.id.constraint_layout)
        val red_button: View = findViewById(R.id.red_button)
        val green_button: View = findViewById(R.id.green_button)
        val yellow_button: View = findViewById(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(box_text_one, box_text_two, box_text_three, box_text_four, box_text_five,
                red_button, yellow_button, green_button, constraint_layout)


        for(item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }
    }



    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}