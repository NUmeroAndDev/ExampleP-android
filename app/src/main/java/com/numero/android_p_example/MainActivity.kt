package com.numero.android_p_example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomAppBarButton.setOnClickListener {
            startActivity(BottomAppBarActivity.createIntent(this@MainActivity))
        }
        materialCardButton.setOnClickListener {
            startActivity(MaterialCardActivity.createIntent(this@MainActivity))
        }
    }
}
