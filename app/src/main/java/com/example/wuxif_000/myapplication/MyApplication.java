package com.example.wuxif_000.myapplication;

import android.app.Application;
import android.os.Handler;

import com.tencent.bugly.crashreport.CrashReport;


/**
 * Created by wuxif_000 on 2016/4/5.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       CrashReport.initCrashReport(getApplicationContext(),"900024561",false);
        Runnable run2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.print("start"+i);
                }
                CrashReport.testJavaCrash();
            }
        };
        new Handler().postDelayed(run2,5000
        );
    }
}
