package com.example.mike.leagueapp;

import android.content.Intent;
import android.os.Parcelable;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.static_data.constant.ChampionListTags;
import net.rithms.riot.api.endpoints.static_data.constant.Locale;
import net.rithms.riot.api.endpoints.static_data.dto.Champion;
import net.rithms.riot.api.endpoints.static_data.dto.ChampionList;
import net.rithms.riot.constant.Platform;



public class ChampSelect1 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "test";
    public static final String NAME_MESSAGE = "ChampName";                                                  // we need these for the intents and the passing of information between activities
    public static final String TITLE_MESSAGE = "ChampTitle";
    public static final String PASSIVE_MESSAGE = "ChampPass";
    public static final String Q_MESSAGE = "ChampQ";
    public static final String W_MESSAGE = "ChampW";
    public static final String E_MESSAGE = "ChampE";
    public static final String R_MESSAGE = "ChampR";
    public String gotChamps = "no";

    public ArrayList<champion> champs = new ArrayList<champion>();;                                             // having the app take a second to make the API requests and build the array lists of champions takes too long
                                                                                                        // so we want to pass this array list between activities
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_select);
        if(getIntent().hasExtra("gotChamps")){                                                  // if we have the extra gotChamps we are returning from a champion select page and DO NOT want to access the api again
            gotChamps = "yes";
        }

        if (gotChamps.equals("no") ) {                                                                // get the champions we dont have them
            try{
                getChamps();
            } catch (RiotApiException e) {
                e.printStackTrace();
            }
        }
        else{
            champs = getIntent().getParcelableArrayListExtra("champs");

        }

    }

    public void getChamps() throws RiotApiException{                                                    // gets all the information on all the champs from the api
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);                                                             // allows networking in main thread, I know, bad practices. but we must carry on for now

        ApiConfig config = new ApiConfig().setKey("RGAPI-b1a866e0-f1f4-4961-b657-2787ebb94b97");        // API key, proabaly out of date at this point
        RiotApi api = new RiotApi(config);
        // Get all champions and create thier champion objects add to array list, champid, name, title, q, w, e, r, passive
        ChampionList championList = api.getDataChampionList(Platform.NA, Locale.EN_US, null, false, ChampionListTags.ALL);
        Map<String, Champion> map = championList.getData();
        for (Champion champion : map.values()) {
            champion champ = new champion(champion.getId(), champion.getName(), champion.getTitle(), champion.getSpells().get(0) + " - " + champion.getSpells().get(0).getSanitizedDescription(), champion.getSpells().get(1) + " - " + champion.getSpells().get(1).getSanitizedDescription(), champion.getSpells().get(2) + " - " + champion.getSpells().get(2).getSanitizedDescription(), champion.getSpells().get(3) + " - " + champion.getSpells().get(3).getSanitizedDescription(), "Passive: " + champion.getPassive().getSanitizedDescription());
            champs.add(champ);

        }

    }


    public void showAnnie(View view) {                                              // so, so many ShowChampion functions, yes there are shorter ways to do this,
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "annie";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Annie")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }


    public void showAatrox(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "aatrox";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Aatrox")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showAhri(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ahri";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Ahri")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAkali(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "akali";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Akali")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAlistar(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "alistar";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Alistar")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAmumu(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "amumu";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Amumu")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAnivia(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "anivia";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Anivia")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAshe(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ashe";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Ashe")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAurelion(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "aurelionsol";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Aurelion Sol")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showAzir(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "azir";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Azir")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showBard(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "bard";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Bard")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showBlitzcrank(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "blitzcrank";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Blitzcrank")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showBrand(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "brand";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Brand")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showBraum(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "braum";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Braum")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showCaitlyn(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "caitlyn";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Caitlyn")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showCamille(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "camille";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Camille")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showCassiopeia(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "cassiopeia";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Cassiopeia")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showCho(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "chogath";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Cho'Gath")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showCorki(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "corki";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Corki")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showDarius(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "darius";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Darius")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showDiana(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "diana";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Diana")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showDrM(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "drmundo";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Dr. Mundo")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showDraven(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "draven";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Draven")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showEkko(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ekko";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Ekko")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showElise(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "elise";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Elise")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showEvelynn(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "evelynn";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Evelynn")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showEzreal(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ezreal";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Ezreal")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showFiddlesticks(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "fiddlesticks";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Fiddlesticks")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showFiora(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "fiora";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Fiora")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showFizz(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "fizz";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Fizz")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showGalio(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "galio";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Galio")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showGangplank(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "gangplank";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Gangplank")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showGaren(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "garen";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Garen")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showGnar(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "gnar";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Gnar")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showGragas(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "gragas";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Gragas")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showGraves(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "graves";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Graves")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showHecarim(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "hecarim";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Hecarim")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }
    public void showHeimerdinger(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "heimerdinger";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Heimerdinger")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showIllaoi(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "illaoi";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Illaoi")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showIrelia(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "irelia";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Irelia")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showIvern(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ivern";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Ivern")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void showJanna(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "janna";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Janna")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }

    public void shoJarvan(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "jarvaniv";
        String name = "";
        String title = "";
        String passive = "";
        String q = "";
        String w = "";
        String e = "";
        String r = "";
        intent.putExtra(EXTRA_MESSAGE, message);
        int len = champs.size();
        int i = 0;
        while( i < len){
            if(champs.get(i).getName().equals("Jarvan IV")){
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len -1;
            }
            i++;
        }
        intent.putExtra(NAME_MESSAGE, name);
        intent.putExtra(TITLE_MESSAGE, title);
        intent.putExtra(PASSIVE_MESSAGE, passive);
        intent.putExtra(Q_MESSAGE, q);
        intent.putExtra(W_MESSAGE, w);
        intent.putExtra(E_MESSAGE, e);
        intent.putExtra(R_MESSAGE, r);

        startActivity(intent);

    }


                                                                                                                // these 3 buttons go back and forth between the champion select pages, they pass the champs arraylist to
    public void showSelect2(View view) {                                                                            // avoid relooking up the champions in the API
        // Do something in response to button

        Intent intent = new Intent(this, activity_champ_select2.class);
        intent.putParcelableArrayListExtra("champs", champs);
        startActivity(intent);

    }
    public void showSelect3(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_champ_select3.class);
        intent.putParcelableArrayListExtra("champs", champs);
        startActivity(intent);

    }
    public void showSelect1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampSelect1.class);
        intent.putParcelableArrayListExtra("champs", champs);
        intent.putExtra("gotChamps",1);
        startActivity(intent);

    }

}

