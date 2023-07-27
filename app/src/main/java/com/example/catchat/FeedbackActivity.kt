package com.example.catchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_feedback)
		setSupportActionBar(findViewById(R.id.toolbar_main))
	}
}
