package com.example.user.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.project4.sampledata.Camel;
import com.example.user.project4.sampledata.Eagle;
import com.example.user.project4.sampledata.Ektara;
import com.example.user.project4.sampledata.Med;
import com.example.user.project4.sampledata.Nature;
import com.example.user.project4.sampledata.Ojon;
import com.example.user.project4.sampledata.Sun;
import com.example.user.project4.sampledata.Unity;
import com.example.user.project4.sampledata.ilish;
import com.example.user.project4.sampledata.mango;
import com.example.user.project4.sampledata.python;

public class Pageb1 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageb1);

        listView = findViewById(R.id.lv);


        final String[] name = {"অ", "আ", "ই","ঈ","উ","ঊ","ঋ","এ","ঐ","ও","ঔ"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layout, R.id.textView1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            python fragment = new python();
            fragment = new python();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();

        }
        if (position == 1) {
            mango fragment = new mango();
            fragment = new mango();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 2) {
            ilish fragment = new ilish();
            fragment = new ilish();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 3) {
            Eagle fragment = new Eagle();
            fragment = new Eagle();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 4) {
            Camel fragment = new Camel();
            fragment = new Camel();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 5) {
            Sun fragment = new Sun();
            fragment = new Sun();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 6) {
            Nature fragment = new Nature();
            fragment = new Nature();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 7) {
            Ektara fragment = new Ektara();
            fragment = new Ektara();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 8) {
            Unity fragment = new Unity();
            fragment = new Unity();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 9) {
            Ojon fragment = new Ojon();
            fragment = new Ojon();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 10) {
            Med fragment = new Med();
            fragment = new Med();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }




    }
}
