package com.example.simpleclickerappadvj2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end onCreate event handler

    public void nextPage(View v)
    {
        startActivity(new Intent(MainActivity.this, ClickerPage.class));
    }//end nextPage event handler
}