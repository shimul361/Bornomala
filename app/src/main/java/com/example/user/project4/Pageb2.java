package com.example.user.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.project4.sampledata.Bag;
import com.example.user.project4.sampledata.Banana;
import com.example.user.project4.sampledata.Barlee;
import com.example.user.project4.sampledata.Bear;
import com.example.user.project4.sampledata.Bird;
import com.example.user.project4.sampledata.Boat;
import com.example.user.project4.sampledata.Book;
import com.example.user.project4.sampledata.Bro;
import com.example.user.project4.sampledata.Car;
import com.example.user.project4.sampledata.Cold;
import com.example.user.project4.sampledata.Cow;
import com.example.user.project4.sampledata.Deer;
import com.example.user.project4.sampledata.Dhol;
import com.example.user.project4.sampledata.Dove;
import com.example.user.project4.sampledata.Duck;
import com.example.user.project4.sampledata.Egg;
import com.example.user.project4.sampledata.Ele;
import com.example.user.project4.sampledata.Fish;
import com.example.user.project4.sampledata.Flower;
import com.example.user.project4.sampledata.Frog;
import com.example.user.project4.sampledata.Glasses;
import com.example.user.project4.sampledata.Lemon;
import com.example.user.project4.sampledata.Lily;
import com.example.user.project4.sampledata.Lion;
import com.example.user.project4.sampledata.Mag;
import com.example.user.project4.sampledata.Melon;
import com.example.user.project4.sampledata.Moon;
import com.example.user.project4.sampledata.Ox;
import com.example.user.project4.sampledata.Paddy;
import com.example.user.project4.sampledata.Parrot;
import com.example.user.project4.sampledata.Peacock;
import com.example.user.project4.sampledata.Pearl;
import com.example.user.project4.sampledata.Rabbit;
import com.example.user.project4.sampledata.Rain;
import com.example.user.project4.sampledata.Sad;
import com.example.user.project4.sampledata.Ship;
import com.example.user.project4.sampledata.Shrimp;
import com.example.user.project4.sampledata.Teacher;
import com.example.user.project4.sampledata.Umbr;
import com.example.user.project4.sampledata.Watch;

public class Pageb2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageb2);

        listView = findViewById(R.id.lv);


        final String[] name = {"ক","খ","গ","ঘ","ঙ","চ","ছ","জ","ঝ","ঞ","ট","ঠ","ড","ঢ","ণ",
                                    "ত","থ","দ","ধ","ন","প","ফ","ব","ভ","ম","য","র","ল","শ",
                                        "ষ","স","হ","ক্ষ","ড়","ঢ়","য়","ৎ","ং","ঃ","ঁ"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layout, R.id.textView1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            Banana fragment = new Banana();
            fragment = new Banana();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();

        }
        if (position == 1) {
            Rabbit fragment = new Rabbit();
            fragment = new Rabbit();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 2) {
            Cow fragment = new Cow();
            fragment = new Cow();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 3) {
            Watch fragment = new Watch();
            fragment = new Watch();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 4) {
            Frog fragment = new Frog();
            fragment = new Frog();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 5) {
            Glasses fragment = new Glasses();
            fragment = new Glasses();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 6) {
            Umbr fragment = new Umbr();
            fragment = new Umbr();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 7) {
            Ship fragment = new Ship();
            fragment = new Ship();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 8) {
            Pearl fragment = new Pearl();
            fragment = new Pearl();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 9) {
            Bro fragment = new Bro();
            fragment = new Bro();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 10) {
            Parrot fragment = new Parrot();
            fragment = new Parrot();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 11) {
            Cold fragment = new Cold();
            fragment = new Cold();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 12) {
            Egg fragment = new Egg();
            fragment = new Egg();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 13) {
            Dhol fragment = new Dhol();
            fragment = new Dhol();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 14) {
            Deer fragment = new Deer();
            fragment = new Deer();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 15) {
            Melon fragment = new Melon();
            fragment = new Melon();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 16) {
            Bag fragment = new Bag();
            fragment = new Bag();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 17) {
            Mag fragment = new Mag();
            fragment = new Mag();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 18) {
            Paddy fragment = new Paddy();
            fragment = new Paddy();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 19) {
            Boat fragment = new Boat();
            fragment = new Boat();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 20) {
            Bird fragment = new Bird();
            fragment = new Bird();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 21) {
            Flower fragment = new Flower();
            fragment = new Flower();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 22) {
            Book fragment = new Book();
            fragment = new Book();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 23) {
            Bear fragment = new Bear();
            fragment = new Bear();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 24) {
            Peacock fragment = new Peacock();
            fragment = new Peacock();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 25) {
            Barlee fragment = new Barlee();
            fragment = new Barlee();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 26) {
            Duck fragment = new Duck();
            fragment = new Duck();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 27) {
            Lemon fragment = new Lemon();
            fragment = new Lemon();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 28) {
            Lily fragment = new Lily();
            fragment = new Lily();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 29) {
            Ox fragment = new Ox();
            fragment = new Ox();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 30) {
            Lion fragment = new Lion();
            fragment = new Lion();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 31) {
            Ele fragment = new Ele();
            fragment = new Ele();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 32) {
            Teacher fragment = new Teacher();
            fragment = new Teacher();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 33) {
            Car fragment = new Car();
            fragment = new Car();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 34) {
            Rain fragment = new Rain();
            fragment = new Rain();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 35) {
            Dove fragment = new Dove();
            fragment = new Dove();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 36) {
            Fish fragment = new Fish();
            fragment = new Fish();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 37) {
            Shrimp fragment = new Shrimp();
            fragment = new Shrimp();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 38) {
            Sad fragment = new Sad();
            fragment = new Sad();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 39) {
            Moon fragment = new Moon();
            fragment = new Moon();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }


    }
}
