package com.example.catchat.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.catchat.R
import com.example.catchat.fragment.DraftsFragment
import com.example.catchat.fragment.InboxFragment
import com.example.catchat.fragment.SentItemsFragment
import com.example.catchat.fragment.TrashFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val toolbar: Toolbar = findViewById(R.id.toolbar_main)
		setSupportActionBar(toolbar)

		val frag: Fragment = InboxFragment()
		val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
		ft.add(R.id.content_frame, frag)
		ft.commit()

		val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
		val toggle = ActionBarDrawerToggle(
			this, drawer, toolbar,
			R.string.nav_open_drawer,
			R.string.nav_close_drawer
		)
		drawer.addDrawerListener(toggle)
		toggle.syncState()

		val navigationView: NavigationView = findViewById(R.id.nav_view)
		navigationView.setNavigationItemSelectedListener(this)
	}

	override fun onNavigationItemSelected(item: MenuItem): Boolean {
		val id = item.itemId
		var fragment: Fragment? = null
		var intent: Intent? = null

		when (id) {
			R.id.nav_drafts -> fragment = DraftsFragment()
			R.id.nav_sent -> fragment = SentItemsFragment()
			R.id.nav_trash -> fragment = TrashFragment()
			R.id.nav_help -> intent = Intent(this, HelpActivity::class.java)
			R.id.nav_feedback -> intent = Intent(this, FeedbackActivity::class.java)
			else -> fragment = InboxFragment()
		}

		if (fragment != null) {
			val ft = supportFragmentManager.beginTransaction()
			ft.replace(R.id.content_frame, fragment)
			ft.commit()
		} else
			startActivity(intent)
		findViewById<DrawerLayout>(R.id.drawer_layout).closeDrawer(GravityCompat.START)
		return true
	}

	override fun onBackPressed() {
		val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
		if (drawer.isDrawerOpen(GravityCompat.START))
			drawer.closeDrawer(GravityCompat.START)
		else
			super.onBackPressed()
	}
}
