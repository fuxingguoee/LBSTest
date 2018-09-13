package com.example.lbstest;

/**
 * Created by Administrator on 2018/8/29 0029.
 */

interface BDLocationListener {
    void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults);

    void onConnectHotSpotMessage(String s, int i);
}
