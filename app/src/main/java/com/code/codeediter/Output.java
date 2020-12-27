package com.code.codeediter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Output extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        webView = findViewById(R.id.webView);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(Global.code, "text/html; charset=utf-8", "UTF-8");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.close_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.play:
                //  Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
               // startActivity(new Intent(getApplicationContext(),Output.class));
                return true;
            case R.id.edit:
                // Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
               // startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}