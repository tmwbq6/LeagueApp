package com.example.mike.leagueapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class activity_champ_select3 extends AppCompatActivity {
    ArrayList<champion> champs;                                                                                                         // more of the same as champselect 1 and 2
    public static final String EXTRA_MESSAGE = "test";
    public static final String NAME_MESSAGE = "ChampName";
    public static final String TITLE_MESSAGE = "ChampTitle";
    public static final String PASSIVE_MESSAGE = "ChampPass";
    public static final String Q_MESSAGE = "ChampQ";
    public static final String W_MESSAGE = "ChampW";
    public static final String E_MESSAGE = "ChampE";
    public static final String R_MESSAGE = "ChampR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_select3);
        champs = getIntent().getParcelableArrayListExtra("champs");                                                                     // retrieve the arraylist of champs
    }
    public void showSelect1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,ChampSelect1.class);
        intent.putParcelableArrayListExtra("champs", champs);
        intent.putExtra("gotChamps","yes");
        startActivity(intent);

    }
    public void showSelect2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_champ_select2.class);
        intent.putParcelableArrayListExtra("champs", champs);
        startActivity(intent);

    }
    public void showRek(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "reksai";
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
            if(champs.get(i).getName().equals("Rek'Sai")){
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

    public void showRenek(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "renekton";
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
            if(champs.get(i).getName().equals("Renekton")){
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

    public void showRengar(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "rengar";
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
            if(champs.get(i).getName().equals("Rengar")){
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
    public void showRiven(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "riven";
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
            if(champs.get(i).getName().equals("Riven")){
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

    public void showRumble(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "rumble";
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
            if(champs.get(i).getName().equals("Rumble")){
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

    public void showRyze(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ryze";
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
            if(champs.get(i).getName().equals("Ryze")){
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

    public void showSejuani(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "sejuani";
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
            if(champs.get(i).getName().equals("Sejuani")){
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

    public void showShaco(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "shaco";
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
            if(champs.get(i).getName().equals("Shaco")){
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

    public void showShen(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "shen";
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
            if(champs.get(i).getName().equals("Shen")){
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

    public void showShyv(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "shyvana";
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
            if(champs.get(i).getName().equals("Shyvana")){
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

    public void showSinged(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "singed";
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
            if(champs.get(i).getName().equals("Singed")){
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

    public void showSion(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "sion";
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
            if(champs.get(i).getName().equals("Sion")){
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

    public void showSivir(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "sivir";
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
            if(champs.get(i).getName().equals("Sivir")){
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

    public void showSkarner(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "skarner";
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
            if(champs.get(i).getName().equals("Skarner")){
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

    public void showSona(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "sona";
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
            if(champs.get(i).getName().equals("Sona")){
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

    public void showSoraka(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "soraka";
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
            if(champs.get(i).getName().equals("Soraka")){
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

    public void showSwain(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "swain";
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
            if(champs.get(i).getName().equals("Swain")){
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

    public void showSyndra(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "syndra";
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
            if(champs.get(i).getName().equals("Syndra")){
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

    public void showTahm(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "tahmkench";
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
            if(champs.get(i).getName().equals("Tahm Kench")){
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

    public void showTryndamere(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "tryndamere";
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
            if(champs.get(i).getName().equals("Tryndamere")){
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

    public void showTwistedFate(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "twistedfate";
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
            if(champs.get(i).getName().equals("Twisted Fate")){
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

    public void showTaliyah(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "taliyah";
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
            if(champs.get(i).getName().equals("Taliyah")){
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

    public void showTalon(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "talon";
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
            if(champs.get(i).getName().equals("Talon")){
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

    public void showTaric(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "taric";
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
            if(champs.get(i).getName().equals("Taric")){
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

    public void showTeemo(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "teemo";
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
            if(champs.get(i).getName().equals("Teemo")){
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

    public void showThresh(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "thresh";
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
            if(champs.get(i).getName().equals("Thresh")){
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

    public void showTrist(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "tristana";
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
            if(champs.get(i).getName().equals("Tristana")){
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

    public void showTrundle(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "trundle";
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
            if(champs.get(i).getName().equals("Trundle")){
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

    public void showVladimir(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "vladimir";
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
            if(champs.get(i).getName().equals("Vladimir")){
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

    public void showTwitch(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "twitch";
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
            if(champs.get(i).getName().equals("Twitch")){
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

    public void showUdyr(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "udyr";
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
            if(champs.get(i).getName().equals("Udyr")){
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

    public void showUrgot(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "urgot";
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
            if(champs.get(i).getName().equals("Urgot")){
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

    public void showVarus(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "varus";
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
            if(champs.get(i).getName().equals("Varus")){
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

    public void showVayne(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "vayne";
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
            if(champs.get(i).getName().equals("Vayne")){
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

    public void showVeigar(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "veigar";
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
            if(champs.get(i).getName().equals("Veigar")){
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

    public void showVel(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "velkoz";
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
            if(champs.get(i).getName().equals("Vel'Koz")){
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

    public void showVi(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "vi";
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
            if(champs.get(i).getName().equals("Vi")){
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

    public void showViktor(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "viktor";
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
            if(champs.get(i).getName().equals("Viktor")){
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

    public void showVolibear(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "volibear";
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
            if(champs.get(i).getName().equals("Volibear")){
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

    public void showWarwick(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "warwick";
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
            if(champs.get(i).getName().equals("Warwick")){
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

    public void showWukong(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "wukong";
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
            if(champs.get(i).getName().equals("Wukong")){
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

    public void showXayah(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "xayah";
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
            if(champs.get(i).getName().equals("Xayah")){
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

    public void showXerath(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "xerath";
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
            if(champs.get(i).getName().equals("Xerath")){
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

    public void showXin(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "xinzhao";
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
            if(champs.get(i).getName().equals("Xin Zhao")){
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

    public void showYasuo(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "yasuo";
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
            if(champs.get(i).getName().equals("Yasuo")){
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

    public void showYorick(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "yorick";
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
            if(champs.get(i).getName().equals("Yorick")){
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

    public void showZac(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "zac";
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
            if(champs.get(i).getName().equals("Zac")){
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

    public void showZed(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "zed";
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
            if(champs.get(i).getName().equals("Zed")){
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


    public void showZiggs(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "ziggs";
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
            if(champs.get(i).getName().equals("Ziggs")){
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

    public void showZilean(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "zilean";
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
            if(champs.get(i).getName().equals("Zilean")){
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


    public void showZoe(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "zoe";
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
            if(champs.get(i).getName().equals("Zoe")){
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

    public void showZyra(View view){
        // Do something in response to button
        Intent intent = new Intent(this, ChampionView.class);
        String message = "zyra";
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
            if(champs.get(i).getName().equals("Zyra")){
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
