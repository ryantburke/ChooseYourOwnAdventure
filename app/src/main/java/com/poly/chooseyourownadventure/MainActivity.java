package com.poly.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvStoryTitle, tvOptionTitle;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labor_day);

        Intent intent = new Intent(MainActivity.this, RpgHotDogEatingContest.class);

        startActivity(intent);
    }
}