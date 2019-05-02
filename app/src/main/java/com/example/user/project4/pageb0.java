package com.example.user.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pageb0 extends AppCompatActivity implements View.OnClickListener{
    Button button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageb0);

        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);

        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

        public void onClick(View view){
            String button_text1;
            button_text1 = ((Button)view).getText().toString();

            if (button_text1.equals("স্বরবর্ণ")){
                Intent button4 = new Intent(this.getApplicationContext(),Pageb1.class);
                startActivity(button4);
            }

            else if (button_text1.equals("ব্যঞ্জনবর্ণ")) {
                Intent button5 = new Intent(this.getApplicationContext(),Pageb2.class);
                startActivity(button5);
            }
    }
}
