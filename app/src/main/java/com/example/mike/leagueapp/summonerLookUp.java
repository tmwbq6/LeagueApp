package com.example.mike.leagueapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class summonerLookUp extends AppCompatActivity {
    public static final String SUMMONER_MESSAGE = "vOID";       // if i ever see the message vOID we can assume it's because I've done something wrong.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner_look_up);
    }

    public void onSearch(View view  ) {
        Intent intent = new Intent(this, SummonerView.class);                       // respond to the search button press by showing the summoner view activity
        EditText summonerName = (EditText) findViewById(R.id.sumName);
        intent.putExtra(SUMMONER_MESSAGE, summonerName.getText().toString());                       // get the text from the search box and send it as a String Extra
        startActivity(intent);
    }
}
