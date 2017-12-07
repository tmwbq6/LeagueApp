package com.example.mike.leagueapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showS(View view) {
        // Show the champselect1 activity in response to the button press
        Intent intent = new Intent(this, ChampSelect1.class);
        startActivity(intent);

    }

    public void showP(View view) {
        // Show the summoner look up activity in response to the button press
        Intent intent = new Intent(this, summonerLookUp.class);
        startActivity(intent);

    }
}
