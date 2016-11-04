package cn.droid8.android;

import cn.droid8.baselibrary.*;
import cn.droid8.baselibrary.klog.KLog;

/**
 * Created by Droid8 on 2016/11/4.
 */

public class DroidApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(BuildConfig.LOG_DEBUG, BuildConfig.DEFAULT_TAG);
        KLog.i();
    }
}
