package com.example.mike.leagueapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class activity_champ_select2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "test";                                                                                                      // its a mirror of champselect1 with different champions on it
    public static final String NAME_MESSAGE = "ChampName";
    public static final String TITLE_MESSAGE = "ChampTitle";
    public static final String PASSIVE_MESSAGE = "ChampPass";
    public static final String Q_MESSAGE = "ChampQ";
    public static final String W_MESSAGE = "ChampW";
    public static final String E_MESSAGE = "ChampE";
    public static final String R_MESSAGE = "ChampR";
    ArrayList<champion> champs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_select2);
        champs = getIntent().getParcelableArrayListExtra("champs");                                                                 // get that arraylist of champs
    }

    public void showSelect1(View view) {                                                                                                    // buttons to change champion select pages is at the top now
        // Do something in response to button
        Intent intent = new Intent(this, ChampSelect1.class);
        intent.putParcelableArrayListExtra("champs", champs);
        intent.putExtra("gotChamps","yes");
        startActivity(intent);

    }

    public void showSelect3(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_champ_select3.class);
        intent.putParcelableArrayListExtra("champs", champs);
        startActivity(intent);

    }


    public void shoJax(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "jax";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Jax")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void shoJayce(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "jayce";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Jayce")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void shoJhin(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "jhin";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Jhin")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showJinx(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "jinx";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Jinx")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKalista(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kalista";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kalista")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKarma(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "karma";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Karma")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKarthus(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "karthus";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Karthus")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKassadin(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kassadin";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kassadin")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKatarina(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "katarina";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Katarina")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKayle(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kayle";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kayle")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKayn(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kayn";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kayn")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKennen(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kennen";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kennen")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKha(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "khazix";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kha'Zix")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKindred(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kindred";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kindred")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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


    public void showKled(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kled";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kled")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showKog(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "kogmaw";
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
        while (i < len) {
            if (champs.get(i).getName().equals("Kog'Maw")) {
                name = champs.get(i).getName();
                title = champs.get(i).getTitle();
                passive = champs.get(i).getPassive();
                q = champs.get(i).getQ();
                w = champs.get(i).getW();
                e = champs.get(i).getE();
                r = champs.get(i).getR();
                i = len - 1;
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

    public void showLeBlanc(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "leblanc";
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
            if(champs.get(i).getName().equals("LeBlanc")){
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

    public void showLee(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "leesin";
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
            if(champs.get(i).getName().equals("Lee Sin")){
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

    public void showLeona(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "leona";
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
            if(champs.get(i).getName().equals("Leona")){
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

    public void showLiss(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "lissandra";
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
            if(champs.get(i).getName().equals("Lissandra")){
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
    public void showLucian(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "lucian";
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
            if(champs.get(i).getName().equals("Lucian")){
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

    public void showLulu(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "lulu";
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
            if(champs.get(i).getName().equals("Lulu")){
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

    public void showLux(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "lux";
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
            if(champs.get(i).getName().equals("Lux")){
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

    public void showMalphite(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "malphite";
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
            if(champs.get(i).getName().equals("Malphite")){
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

    public void showMalzahar(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "malzahar";
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
            if(champs.get(i).getName().equals("Malzahar")){
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

    public void showMao(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "maokai";
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
            if(champs.get(i).getName().equals("Maokai")){
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

    public void showMasterYi(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "masteryi";
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
            if(champs.get(i).getName().equals("Master Yi")){
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

    public void showMiss(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "missfortune";
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
            if(champs.get(i).getName().equals("Miss Fortune")){
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

    public void showMorgana(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "morgana";
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
            if(champs.get(i).getName().equals("Morgana")){
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

    public void showMorde(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "mordekaiser";
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
            if(champs.get(i).getName().equals("Mordekaiser")){
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

    public void showNami(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nami";
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
            if(champs.get(i).getName().equals("Nami")){
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

    public void showNasus(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nasus";
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
            if(champs.get(i).getName().equals("Nasus")){
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

    public void showNautilus(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nautilus";
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
            if(champs.get(i).getName().equals("Nautilus")){
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

    public void showNidalee(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nidalee";
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
            if(champs.get(i).getName().equals("nidalee")){
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

    public void showNocturne(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nocturne";
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
            if(champs.get(i).getName().equals("Nunu")){
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

    public void showNunu(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "nunu";
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
            if(champs.get(i).getName().equals("Nunu")){
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

    public void showOlaf(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "olaf";
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
            if(champs.get(i).getName().equals("Olaf")){
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

    public void showOrianna(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "orianna";
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
            if(champs.get(i).getName().equals("Orianna")){
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

    public void showOrnn(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ornn";
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
            if(champs.get(i).getName().equals("Ornn")){
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

    public void showPantheon(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "pantheon";
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
            if(champs.get(i).getName().equals("Pantheon")){
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
    public void showPoppy(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "poppy";
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
            if(champs.get(i).getName().equals("Poppy")){
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

    public void showQuinn(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "quinn";
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
            if(champs.get(i).getName().equals("Quinn")){
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

    public void showRakan(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "rakan";
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
            if(champs.get(i).getName().equals("Rakan")){
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

    public void showRam(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "rammus";
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
            if(champs.get(i).getName().equals("Rammus")){
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
}