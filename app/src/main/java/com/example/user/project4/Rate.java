package com.example.user.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rate extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        ratingBar = findViewById(R.id.rating);
        textView = findViewById(R.id.tv);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("আপনার রেটিংঃ " +rating);
                Toast.makeText(getApplicationContext(),"ধন্যবাদ",Toast.LENGTH_SHORT).show();
            }

        });

        textView.setText("রেটিংঃ " +ratingBar.getProgress());

    }
}