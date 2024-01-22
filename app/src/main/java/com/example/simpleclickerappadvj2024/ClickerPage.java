package com.example.simpleclickerappadvj2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ClickerPage extends AppCompatActivity
{
    //instance variables

    int sealsCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker_page);
    }//end onCreate event handler

    public void sealButtonClick (View v)
    {
        Toast.makeText(this, "You have collected your first seal! Award: Beginner's Trophy", Toast.LENGTH_LONG).show();
        sealsCount++;
        TextView outputTextView = (TextView) findViewById(R.id.collectionText);
        outputTextView.setText("You have collected " + sealsCount + " Harp Seal(s)!");
    }//end sealButtonClick event handler
}