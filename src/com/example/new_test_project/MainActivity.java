package com.example.new_test_project;

import android.app.Activity;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView w = (WebView)findViewById(R.id.webview_1);
        w.getSettings().setJavaScriptEnabled(true); 
        w.addJavascriptInterface(new JsObject(), "androidJsBridge");
        if (Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) 
        	  w.getSettings().setAllowUniversalAccessFromFileURLs(true);
        w.setWebChromeClient(new WebChromeClient() {
        	  public boolean onConsoleMessage(ConsoleMessage cm) {
        	    Log.d("JsApplication", cm.message() + " -- From line "
        	                         + cm.lineNumber() + " of "
        	                         + cm.sourceId() );
        	    return true;
        	  }
        	});
        
        w.loadUrl("file:///android_asset/PlainPost/new.html");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

