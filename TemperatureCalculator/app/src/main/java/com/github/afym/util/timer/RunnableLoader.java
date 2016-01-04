package com.github.afym.util.timer;

import com.github.afym.util.ui.Loader;

public class RunnableLoader implements Runnable {
    private Loader loader;

    public RunnableLoader(Loader loader) {
        this.loader = loader;
    }

    @Override
    public void run() {
        this.loader.hide();
    }
}