package com.info.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("TAG Fragment A", "onAttach");
    }

    // TODO: Rename parameter arguments, choose names that match
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("TAG Fragment A", "onCreateView");
        //textView

        View v =  inflater.inflate(R.layout.fragment_first, container, false);

        TextView bButtonActivity= v.findViewById(R.id.textView);
        bButtonActivity.setText("FRAGMENT A");
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
   //     Button bFirstFragment=view.findViewById(R.id.bFirstFragment);
        Log.e("TAG Fragment A", "onViewCreated");
//        bFirstFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG Fragment A", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("TAG Fragment A", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("TAG Fragment A", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("TAG Fragment A", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("TAG Fragment A", "onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e("TAG Fragment A", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment A", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment A", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment A", "onDetach");
    }
}