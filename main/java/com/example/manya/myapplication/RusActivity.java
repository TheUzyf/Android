package com.example.manya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(RusActivity.this, Quest1RusActivity.class);
        startActivity(intent);
    }

}
