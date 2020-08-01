package com.thomasphillips3.aboutme

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun updateNickname(view: View) {
        nicknameText.text = nicknameEdit.text
        nicknameEdit.text.clear()
        nicknameText.visibility = View.VISIBLE
    }
}