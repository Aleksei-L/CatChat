package com.example.catchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_help)
		setSupportActionBar(findViewById(R.id.toolbar_main))
	}
}
