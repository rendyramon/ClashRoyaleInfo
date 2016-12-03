package com.example.seba_note.clashroyaleinfo;

import android.app.Application;
import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class App extends Application {

    private static App instance;
    private static ServerAPI serverAPI;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ServerAPI.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        serverAPI = retrofit.create(ServerAPI.class);
    }

    public static ServerAPI getServerAPI() {
        return serverAPI;
    }
}
