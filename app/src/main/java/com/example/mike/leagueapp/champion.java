package com.example.mike.leagueapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.jar.Attributes;

/**
 * Created by Mike on 12/3/2017.
 */

public class champion implements Parcelable {           // implement parcelable so we can pass its arraylist via intent between activites
    private Integer id = 0;
    private String name    = "";
    private String title   = "";
    private String passive = "";
    private String q = "";
    private String w = "";                                                  // attributes
    private String e = "";
    private String r = "";

    public champion(Integer id, String name, String title, String q, String w, String e, String r, String passive){
        this.id  = id;
        this.name = name;
        this.title = title;
        this.q = q;                                                                                     // constructor
        this.w = w;
        this.e = e;
        this.r = r;
        this.passive = passive;


    }



    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }               // the gets
    public String getTitle(){
        return this.title;
    }
    public String getPassive(){
        return this.passive;
    }
    public String getQ(){
        return this.q;
    }
    public String getW(){
        return this.w;
    }
    public String getE(){
        return this.e;
    }
    public String getR(){
        return this.r;
    }

    public champion(Parcel in) {            // calls read from parcel to "unpack" our champions
        readFromParcel(in);

    }
    @Override
    public int describeContents() {
        return 0;
    }           // we needed this function, so we have it

    @Override
    public void writeToParcel(Parcel dest, int i) {                             // writes champion data to parcel
        dest.writeString(String.valueOf(this.id));
        dest.writeString(this.name);
        dest.writeString(this.title);
        dest.writeString(this.q);
        dest.writeString(this.w);
        dest.writeString(this.e);
        dest.writeString(this.r);
        dest.writeString(this.passive);
    }
    private void readFromParcel(Parcel in){                                            // reads champion data from parcel
        id = Integer.parseInt(in.readString());
        name = in.readString();
        title = in.readString();
        q = in.readString();
        w = in.readString();
        e = in.readString();
        r = in.readString();
        passive = in.readString();
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public champion createFromParcel(Parcel in) {
            return new champion(in);
        }

        public champion[] newArray(int size) {
            return new champion[size];
        }
    };
}
