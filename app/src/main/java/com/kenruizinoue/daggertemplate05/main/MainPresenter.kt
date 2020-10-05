package com.kenruizinoue.daggertemplate05.main

class MainPresenter: MainContract.Presenter {

    private lateinit var view: MainContract.View

    override fun onLoadStart() {
        loadData()
    }

    override fun attach(view: MainContract.View) {
        this.view = view
    }

    private fun loadData() {
        view.displayData("Data loaded")
    }
}