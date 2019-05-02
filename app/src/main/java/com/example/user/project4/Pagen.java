package com.example.user.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.project4.sampledata.Eight;
import com.example.user.project4.sampledata.Five;
import com.example.user.project4.sampledata.Four;
import com.example.user.project4.sampledata.Nine;
import com.example.user.project4.sampledata.One;
import com.example.user.project4.sampledata.Seven;
import com.example.user.project4.sampledata.Six;
import com.example.user.project4.sampledata.Ten;
import com.example.user.project4.sampledata.Three;
import com.example.user.project4.sampledata.Two;

public class Pagen extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagen);

        listView = findViewById(R.id.lv);


        final String[] name = {"এক", "দুই", "তিন","চার","পাঁচ","ছয়","সাত","আট","নয়","দশ"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layout, R.id.textView1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            One fragment = new One();
            fragment = new One();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();

        }
        if (position == 1) {
            Two fragment = new Two();
            fragment = new Two();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 2) {
            Three fragment = new Three();
            fragment = new Three();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 3) {
            Four fragment = new Four();
            fragment = new Four();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }

        if (position == 4) {
            Five fragment = new Five();
            fragment = new Five();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 5) {
            Six fragment = new Six();
            fragment = new Six();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 6) {
            Seven fragment = new Seven();
            fragment = new Seven();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 7) {
            Eight fragment = new Eight();
            fragment = new Eight();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 8) {
            Nine fragment = new Nine();
            fragment = new Nine();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }
        if (position == 9) {
            Ten fragment = new Ten();
            fragment = new Ten();
            getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragment).commit();
        }




    }
}