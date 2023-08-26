package com.example.catchat.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catchat.R

class FeedbackActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_feedback)
		setSupportActionBar(findViewById(R.id.toolbar_main))
	}
}
