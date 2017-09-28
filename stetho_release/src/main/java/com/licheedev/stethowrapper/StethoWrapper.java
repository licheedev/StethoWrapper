package com.licheedev.stethowrapper;

import android.content.Context;
import okhttp3.OkHttpClient;

/**
 * Created by John on 2017/9/28.
 */

public class StethoWrapper {

    /**
     * 初始化Stetho
     *
     * @param context
     */
    public static void initStetho(Context context) {
        //Stetho.initializeWithDefaults(context);
    }

    /**
     * 监视网络
     *
     * @param builder
     */
    public static void inspectNetwork(OkHttpClient.Builder builder) {
        //builder.addNetworkInterceptor(new StethoInterceptor());
    }
}
