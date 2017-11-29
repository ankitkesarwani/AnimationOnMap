package com.example.kesar.animationonmap;

import android.app.Application;

import com.android.volley.RequestQueue;

/**
 * Created by kesar on 11/29/2017.
 */

public class CustomApplication extends Application {
    private RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
    }
    public RequestQueue getVolleyRequestQueue(){
        return requestQueue;
    }
}
