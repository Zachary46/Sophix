package com.example.zachary.sophix;

import android.app.Application;
import com.taobao.sophix.SophixManager;

public class MyRealApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //queryAndLoadNewPatch不可放在attachBaseContext 中，否则无网络权限，建议放在后面任意时刻，如onCreate中
        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
