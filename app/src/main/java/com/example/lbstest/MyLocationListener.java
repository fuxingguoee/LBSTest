package com.example.lbstest;

import com.baidu.location.*;

/**
 * Created by Administrator on 2018/8/29 0029.
 */

interface MyLocationListener extends com.baidu.location.BDLocationListener {
    @Override
    void onReceiveLocation(BDLocation Location);

    void onConnectHotSpotMessage(String s, int i);
}
