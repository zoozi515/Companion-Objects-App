package com.example.companionobjectsapp

import android.view.View

class ChangeBackground {
    companion object{
        val day = 0
        val night = 1
    }

    fun changeBackground (day: Int, layout: View){
        if (day == 0){
            layout.setBackgroundResource(R.drawable.day)
        } else if(day == 1){
            layout.setBackgroundResource(R.drawable.night)
        }
    }
}