package com.example.catchat.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catchat.R

class HelpActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_help)
		setSupportActionBar(findViewById(R.id.toolbar_main))
	}
}
