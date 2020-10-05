package com.kenruizinoue.daggertemplate05.di

import android.app.Activity
import com.kenruizinoue.daggertemplate05.main.MainContract
import com.kenruizinoue.daggertemplate05.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {
    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }
}