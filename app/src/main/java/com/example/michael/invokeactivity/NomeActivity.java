package com.example.michael.invokeactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class NomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome);
    }

    public void next(View view){
        //Explicito
        //Intent intent = new Intent(this, EmailActivity.class);
        //startActivity(intent);

        //Implicito
        Intent intent = new Intent("com.example.michael.invokeactivity.intent.action.EMAIL");
        startActivity(intent);
    }

    public void config(View view){
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }
}
