package com.example.mike.leagueapp;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.match.dto.MatchList;
import net.rithms.riot.api.endpoints.match.dto.MatchReference;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class SummonerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner_view);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();         // I shouldn't be doing this, but I am
        StrictMode.setThreadPolicy(policy);                                                                 // this allows me to perform network activties in the main thread
                                                                                                            // causes the app to seem unresponsive when loading this activity, app fails with no network connection
                                                                                                            // but for now I'm really just trying to learn all of this stuff, and not unnecisarily complicate things

        long[] games = {0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L,0L};
        int sumLevel = 0;
        String name = "";                                                                                   //some initalization of junk to use
        long accId = 0L;
        String displayLevel = "Summoner Level: ";

        Intent intent = getIntent();                                                                        // retieve the string extra of the summoner we are looking up
        name = intent.getStringExtra(summonerLookUp.SUMMONER_MESSAGE);

        try {                                                                                               // this can fail, like for instance if my API key is outdated, so wrap in try/catch


            ApiConfig config = new ApiConfig().setKey("<REPLACE WITH API KEY>");        // Riot Games will give anyone a restricted API key to mess around with
            RiotApi api = new RiotApi(config);                                                              // bad news is the request limits are kinda low and they expire every 24 hours


            // First we need to request the summoner because we will need it's account ID
            Summoner summoner = api.getSummonerByName(Platform.NA, name);

            sumLevel = summoner.getSummonerLevel();
            accId = summoner.getAccountId();                                                                // use the variables from earlier, store the information retrieved by the API on our summoner
            name = summoner.getName();
            displayLevel = displayLevel + String.valueOf(sumLevel);


            int i = 0;


            // Then we can use the account ID to request the summoner's match list
            MatchList matchList = api.getRecentMatchListByAccountId(Platform.NA, summoner.getAccountId());
                                                                                                            // this is kinda pointless at the moment, was something I planned on expanding further in the future
            if (matchList.getMatches() != null) {
                for (MatchReference match : matchList.getMatches()) {
                    games[i] = match.getGameId();
                    i++;
                }                                                                                           // but this would allow me to get detailed stats on the games people have played
            }                                                                                               // and create more complex activites with graphs and charts and all sorts of things


        } catch (RiotApiException e) {                                                                      // if this fails don't want to crash
            e.printStackTrace();
        }

        //name = intent.getStringExtra(summonerLookUp.SUMMONER_MESSAGE);

        TextView textName = findViewById(R.id.textView2);                                                   // display the information we have retrieved so far
        textName.setText(name);

        TextView textLevel = findViewById(R.id.textView3);                                                  // I wanted to do more to make it feel like we were viewing a summoners "profile" -get thier icon and such
        textLevel.setText(displayLevel);
        if(games[0] == 0){
            textLevel.setText("Summoner Not Found");
        }

                                                                                                            // that would involve more local pictures though. ehhh
        TextView textMatch1 = findViewById(R.id.match1);
        textMatch1.setText(String.valueOf(games[0]));

        TextView textMatch2 = findViewById(R.id.match2);
        textMatch2.setText(String.valueOf(games[1]));                                                       // oh if the games array hasn't been touched then the summoner was not found, go ahead and display that.

        TextView textMatch3 = findViewById(R.id.match3);
        textMatch3.setText(String.valueOf(games[2]));

        TextView textMatch4 = findViewById(R.id.match4);
        textMatch4.setText(String.valueOf(games[3]));

        TextView textMatch5 = findViewById(R.id.match5);
        textMatch5.setText(String.valueOf(games[4]));

    }
}
