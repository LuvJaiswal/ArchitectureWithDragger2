package com.example.architecturedragger.base;

import android.app.Application;

import dagger.android.DaggerApplication;


public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override public void onCreate() {

        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }
}
