package com.emmmmt;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

    /* access modifiers changed from: protected */
    @SuppressLint("SetJavaScriptEnabled")
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webview);
        this.mywebView = webView;
        webView.setWebViewClient(new WebViewClient());
        this.mywebView.loadUrl("https://emmmmt.pk/");
        this.mywebView.getSettings().setJavaScriptEnabled(true);
    }

    public class mywebClient extends WebViewClient {
        public mywebClient() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    public void onBackPressed() {
        if (this.mywebView.canGoBack()) {
            this.mywebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}