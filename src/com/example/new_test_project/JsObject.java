package com.example.new_test_project;

import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;

public class JsObject {
    @JavascriptInterface
    public String getDeviceVersion() { 
    	String deviceVersion= Build.VERSION.RELEASE;
    	Log.d("androidJSBridge Version Request",deviceVersion);
    	return deviceVersion; }
    
    @JavascriptInterface 
    public void receiveNewPrivlyURL(String url)
    {
    	Log.d("androidJSBridge URL Received", url);
    }
    
    @JavascriptInterface 
    public String fetchPlatformName()
    {
    	Log.d("androidJSBridge Request", "Platform Identification");
    	return "ANDROID";
    }
    
    @JavascriptInterface 
    public String fetchAuthToken()
    {
    	
    	return "ANDROID";
    }
    
 }