package com.example.user.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.project4.sampledata.Apple;
import com.example.user.project4.sampledata.Ball;
import com.example.user.project4.sampledata.Cat;
import com.example.user.project4.sampledata.Doll;
import com.example.user.project4.sampledata.Eagle2;
import com.example.user.project4.sampledata.Fan;
import com.example.user.project4.sampledata.Goat;
import com.example.user.project4.sampledata.Hen;
import com.example.user.project4.sampledata.Ice;
import com.example.user.project4.sampledata.Jug;
import com.example.user.project4.sampledata.Kite;
import com.example.user.project4.sampledata.Lamp;
import com.example.user.project4.sampledata.Mango2;
import com.example.user.project4.sampledata.Net;
import com.example.user.project4.sampledata.Orange;
import com.example.user.project4.sampledata.Pen;
import com.example.user.project4.sampledata.Queen;
import com.example.user.project4.sampledata.Rat;
import com.example.user.project4.sampledata.Sun2;
import com.example.user.project4.sampledata.Train;
import com.example.user.project4.sampledata.Umb;
import com.example.user.project4.sampledata.Violin;
import com.example.user.project4.sampledata.Watch2;
import com.example.user.project4.sampledata.Xray;
import com.example.user.project4.sampledata.Yak;
import com.example.user.project4.sampledata.Zebra;

public class Pagee0 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagee0);

        listView = findViewById(R.id.lv);


        final String[] name = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layout, R.id.textView1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            Apple fragment = new Apple();
            fragment = new Apple();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();

        }
        if (position == 1) {
            Ball fragment = new Ball();
            fragment = new Ball();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 2) {
            Cat fragment = new Cat();
            fragment = new Cat();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 3) {
            Doll fragment = new Doll();
            fragment = new Doll();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 4) {
            Eagle2 fragment = new Eagle2();
            fragment = new Eagle2();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 5) {
            Fan fragment = new Fan();
            fragment = new Fan();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 6) {
            Goat fragment = new Goat();
            fragment = new Goat();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 7) {
            Hen fragment = new Hen();
            fragment = new Hen();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 8) {
            Ice fragment = new Ice();
            fragment = new Ice();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 9) {
            Jug fragment = new Jug();
            fragment = new Jug();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 10) {
            Kite fragment = new Kite();
            fragment = new Kite();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 11) {
            Lamp fragment = new Lamp();
            fragment = new Lamp();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 12) {
            Mango2 fragment = new Mango2();
            fragment = new Mango2();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 13) {
            Net fragment = new Net();
            fragment = new Net();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 14) {
            Orange fragment = new Orange();
            fragment = new Orange();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 15) {
            Pen fragment = new Pen();
            fragment = new Pen();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 16) {
            Queen fragment = new Queen();
            fragment = new Queen();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 17) {
            Rat fragment = new Rat();
            fragment = new Rat();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 18) {
            Sun2 fragment = new Sun2();
            fragment = new Sun2();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 19) {
            Train fragment = new Train();
            fragment = new Train();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 20) {
            Umb fragment = new Umb();
            fragment = new Umb();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 21) {
            Violin fragment = new Violin();
            fragment = new Violin();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 22) {
            Watch2 fragment = new Watch2();
            fragment = new Watch2();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 23) {
            Xray fragment = new Xray();
            fragment = new Xray();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 24) {
            Yak fragment = new Yak();
            fragment = new Yak();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 25) {
            Zebra fragment = new Zebra();
            fragment = new Zebra();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
    }
}
