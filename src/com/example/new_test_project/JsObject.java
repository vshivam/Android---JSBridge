package com.example.new_test_project;

import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;

public class JsObject {
    @JavascriptInterface
    public String getDeviceVersion() { 
    	String deviceVersion= Build.VERSION.RELEASE;
    	Log.d("DeviceVersion",deviceVersion);
    	return deviceVersion; }
 }