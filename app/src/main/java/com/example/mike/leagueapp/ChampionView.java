package com.example.mike.leagueapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ChampionView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champion_view);




        //we get the message passsed via intent, this will be the intended champions name lowercase no spaces no non alphabetical chars
        Intent intent = getIntent();
        String message = intent.getStringExtra(ChampSelect1.EXTRA_MESSAGE);
        String name =  intent.getStringExtra(ChampSelect1.NAME_MESSAGE);
        String title = intent.getStringExtra(ChampSelect1.TITLE_MESSAGE);
        title = "\"" + title + "\"";
        String passive =  intent.getStringExtra(ChampSelect1.PASSIVE_MESSAGE);
        String q =  intent.getStringExtra(ChampSelect1.Q_MESSAGE);
        String w =  intent.getStringExtra(ChampSelect1.W_MESSAGE);
        String e =  intent.getStringExtra(ChampSelect1.E_MESSAGE);
        String r =  intent.getStringExtra(ChampSelect1.R_MESSAGE);


        //we get the image resource intager, to do this we build our string with the name passed to us
        String loadingImageString = "@drawable/"  + message + "loading";
        int imageResource = getResources().getIdentifier(loadingImageString, null, getPackageName());

        //this captures teh textview on the championview activity named annieq and updates the text of it

        TextView textView = findViewById(R.id.annieq);
        textView.setText(q);

        TextView nameView = findViewById(R.id.name);
        nameView.setText(name);

        TextView textTitle = findViewById(R.id.titleTextbox);
        textTitle.setText(title);

        TextView textPass = findViewById(R.id.p);
        textPass.setText(passive);

        TextView textW = findViewById(R.id.w);
        textW.setText(w);

        TextView textE = findViewById(R.id.e);
        textE.setText(e);

        TextView textR = findViewById(R.id.r);
        textR.setText(r);

        //this captures the imageView to change it to the imageresource represented by the int we got earlier
        Drawable res = getResources().getDrawable(imageResource);
        ImageView championLoading = findViewById(R.id.imageView);
        championLoading.setImageDrawable(res);
    }

}