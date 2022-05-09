package com.nicootech.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {

        val clickableViews: List<View> = listOf(
            text_box_1,
            text_box_2,
            text_box_3,
            text_box_4,
            text_box_5,
            constraint_layout,
            red_button,
            green_button,
            yellow_button
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.text_box_1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_box_2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.text_box_3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text_box_5 -> view.setBackgroundResource(android.R.color.holo_green_light)


            // Boxes using custom colors for background
            R.id.red_button -> text_box_3.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> text_box_4.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> text_box_5.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}