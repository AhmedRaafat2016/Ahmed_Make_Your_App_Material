package com.ahmad.AhmedReader;

import android.app.Application;
import android.content.Context;



public class AhmedReaderApp extends Application {

    public static Context sContext;

    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

}
