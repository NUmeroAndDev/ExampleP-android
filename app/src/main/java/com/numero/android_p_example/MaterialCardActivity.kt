package com.numero.android_p_example

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MaterialCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_card)
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, MaterialCardActivity::class.java)
    }
}
