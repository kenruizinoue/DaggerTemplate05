package com.kenruizinoue.daggertemplate05.di

import com.kenruizinoue.daggertemplate05.main.MainActivity
import dagger.Component

@Component(modules = [ActivityModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}