package com.licheedev.stethowrapper;

import android.app.Application;
import okhttp3.OkHttpClient;

/**
 * Created by John on 2017/9/28.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        
        StethoWrapper.initStetho(this);
        StethoWrapper.inspectNetwork(new OkHttpClient.Builder());
    }
}
