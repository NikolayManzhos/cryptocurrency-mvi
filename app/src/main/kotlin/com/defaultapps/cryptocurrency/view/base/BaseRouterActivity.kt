package com.defaultapps.cryptocurrency.view.base

import android.os.Bundle
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.Conductor
import kotlinx.android.synthetic.main.activity_main.*


abstract class BaseRouterActivity: BaseActivity() {

    protected lateinit var router: Router
    private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        router = Conductor.attachRouter(this, contentFrame, savedInstanceState)
    }

    override fun onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed()
        }
    }

}