package com.rtvt.myapplication2

import android.annotation.SuppressLint
import android.app.Application
import com.umeng.analytics.MobclickAgent
import com.umeng.commonsdk.UMConfigure

/**
 * Created by rtvt-03 on 2019/4/28.
 */

class App:Application(){


    override fun onCreate() {
        super.onCreate()
        //        友盟
        UMConfigure.init(this, "5cc5793a3fc195fc28001459", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null)

        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO)
        // 打开统计SDK调试模式
        UMConfigure.setLogEnabled(true)
    }

}
