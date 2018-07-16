package com.fwp.modulelib;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Administrator on 2018/7/12.
 */

public class BaseApplication extends Application {

    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if(isDebug){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
