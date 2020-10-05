package com.kenruizinoue.daggertemplate05.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenruizinoue.daggertemplate05.R
import com.kenruizinoue.daggertemplate05.di.ActivityModule
import com.kenruizinoue.daggertemplate05.di.DaggerAppComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependency()
        presenter.attach(this)

        button.setOnClickListener {
            presenter.onLoadStart()
        }
    }

    override fun displayData(data: String) {
        textView.text = data
    }

    private fun injectDependency() {
        DaggerAppComponent
                .builder()
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)
    }
}