package com.poly.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvStoryTitle, tvOptionTitle;
    private ImageView ivLaborDay, ivHotDogContest;
    private Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivLaborDay = findViewById(R.id.iv_labor_day);
        ivHotDogContest = findViewById(R.id.iv_hot_dog_contest);

        ivLaborDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AdventureLaborDay.class));
            }
        });

        ivHotDogContest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RpgHotDogEatingContest.class));
            }
        });
    }
}