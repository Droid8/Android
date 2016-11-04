package cn.droid8.baselibrary;

import android.app.Application;

import cn.droid8.baselibrary.klog.KLog;


/**
 * Created by admin on 2016/11/4.
 */

public abstract class BaseApplication extends Application {
    // Application instance
    private static BaseApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        KLog.init(BuildConfig.LOG_DEBUG, BuildConfig.DEFAULT_TAG);
        CrashHandler.getInstance().init(this);
        KLog.i();
    }

    public static BaseApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        KLog.i();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        KLog.i("@level-" + level);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        KLog.i();
    }
}
