package com.info.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TAG", "Activity A onCreate");
        setContentView(R.layout.activity_main);

        Fragment fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentOne,fragmentA,"YOUR_TARGET_FRAGMENT_TAG")
                .addToBackStack("YOUR_SOURCE_FRAGMENT_TAG")
                .commit();

        Button bButtonActivity= findViewById(R.id.buttonPress);
        bButtonActivity.setText("START B");
        bButtonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this, ActivityB.class);
//                startActivity(intent);
                Fragment fragmentB = new FragmentB();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentOne,fragmentB,"YOUR_TARGET_FRAGMENT_TAG")
                        .addToBackStack("YOUR_SOURCE_FRAGMENT_TAG")
                        .commit();
            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("TAG", "Activity A onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "Activity A onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "Activity A onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "Activity A onResume");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("TAG", "Activity A onRestoreInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "Activity A onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "Activity A onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("TAG", "Activity A onSaveInstanceState");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "Activity A onDestroy");
    }

}