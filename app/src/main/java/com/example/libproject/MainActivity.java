package com.example.libproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.utils.TestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtils.Test();
    }
}