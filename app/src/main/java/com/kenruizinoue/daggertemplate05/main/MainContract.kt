package com.kenruizinoue.daggertemplate05.main

class MainContract {
    interface View {
        fun displayData(data: String)
    }

    interface Presenter {
        fun onLoadStart()
        fun attach(view: View)
    }
}