package com.example.myapplication0317;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="201921096최수빈의 activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCreate() called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume() called!");
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause() called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy() called!");
    }
}