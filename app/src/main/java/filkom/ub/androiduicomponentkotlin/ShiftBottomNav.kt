package filkom.ub.androiduicomponentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import filkom.ub.androiduicomponentkotlin.extension.*
import kotlinx.android.synthetic.main.activity_shift_bottom_nav.*

class ShiftBottomNav : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener  {

    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shift_bottom_nav)

        bottomNav = bottom_navigation

        initBottomNavigation()

    }

    private fun initBottomNavigation() {
        bottomNav.enableShiftMode() // Extension function
        bottomNav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }
}
