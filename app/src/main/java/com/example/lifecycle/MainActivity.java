package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.i("LifeCycle", "onCreate Activity Started");
        Toast.makeText(getApplicationContext(), "On Create Activity Started", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {

        super.onStart();
        Log.i("LifeCycle", "onStart Activity Started");
        Toast.makeText(getApplicationContext(), "On Start Activity Started", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {

        super.onResume();
        Log.i("LifeCycle", "onResume Activity Started");
        Toast.makeText(getApplicationContext(), "On Resume Activity Started", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {

        super.onPause();
        Log.i("LifeCycle", "onPause Activity Started");
        Toast.makeText(getApplicationContext(), "On Pause Activity Started", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {

        super.onStop();
        Log.i("LifeCycle", "onStop Activity Started");
        Toast.makeText(getApplicationContext(), "On Stop Activity Started", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {

        super.onDestroy();
        Log.i("LifeCycle", "onDestroy Activity");
        Toast.makeText(getApplicationContext(), "On Destroy Activity Started", Toast.LENGTH_SHORT).show();
    }
}