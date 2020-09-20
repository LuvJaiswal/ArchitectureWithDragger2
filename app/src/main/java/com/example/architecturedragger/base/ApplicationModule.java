package com.example.architecturedragger.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module       //using the dragger module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }

}
