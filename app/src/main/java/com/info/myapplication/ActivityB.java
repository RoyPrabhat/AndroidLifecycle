package com.info.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "Activity B onCreate");
        setContentView(R.layout.activity_main);
        Button bButtonActivity= findViewById(R.id.buttonPress);
        bButtonActivity.setText("FINISH");
        bButtonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e("TAG", "Activity B onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG", "Activity B onRestart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "Activity B onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("TAG Activity B", "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "Activity B onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "Activity B onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("TAG", "Activity B onSaveInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "Activity B onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "Activity B onPause");
    }
}