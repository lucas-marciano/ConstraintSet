package com.lucasmarciano.constraintset

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_change_size_text.*

@RequiresApi(Build.VERSION_CODES.KITKAT)
class ChangeSizeTextActivity : AppCompatActivity() {

    private var checkAnimation = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_size_text)



        tvTitle.setOnClickListener{
            TransitionManager.beginDelayedTransition(root)
            if(checkAnimation) {
                tvTitle.textSize = 60F
                tvTitle.setTextColor(ContextCompat.getColor(this, R.color.amber))
                tvTitle.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
                tvTitle.setPadding(10, 10, 10, 10)
                checkAnimation = false
            } else {
                tvTitle.textSize = 40F
                tvTitle.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
                checkAnimation = true
                tvTitle.setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent))
                tvTitle.setPadding(0, 0, 0, 0)
            }
        }
    }
}
