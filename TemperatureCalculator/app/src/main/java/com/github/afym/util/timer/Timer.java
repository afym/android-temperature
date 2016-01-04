package com.github.afym.util.timer;


import android.os.Handler;

import com.github.afym.util.ui.Loader;

public class Timer {

    public static void delayHideLoader(int seconds, Loader loader) {
        int time = 1000 * seconds;
        final Handler handler = new Handler();

        handler.postDelayed(new RunnableLoader(loader), time);
    }
}