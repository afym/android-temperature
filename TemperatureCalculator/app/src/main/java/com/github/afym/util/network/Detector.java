package com.github.afym.util.network;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Detector {
    private Activity baseActivity;

    public Detector(Activity baseActivity){
        this.baseActivity = baseActivity;
    }

    public static Detector getInstance(Activity baseActivity){
        return new Detector(baseActivity);
    }

    public boolean isAvailable(){
        ConnectivityManager connectivityManager = this.getConnectivity();
        return this.evaluateNetworkInfo(connectivityManager);
    }

    private ConnectivityManager getConnectivity(){
        return (ConnectivityManager)this.baseActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    private boolean evaluateNetworkInfo(ConnectivityManager connectivityManager){
        NetworkInfo acNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return acNetworkInfo != null && acNetworkInfo.isConnected();
    }
}
