package com.code.codeediter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        editText.setText(Global.code);
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
                Global.code = editText.getText().toString();
                startActivity(new Intent(getApplicationContext(),Output.class));
                return true;
            case R.id.edit:
               // Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
               // startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}