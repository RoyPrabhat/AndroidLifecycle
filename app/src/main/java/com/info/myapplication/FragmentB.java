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

public class FragmentB extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("TAG Fragment B", "onAttach");
    }



    // TODO: Rename parameter arguments, choose names that match
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("TAG Fragment B", "onCreateView");
        View v =  inflater.inflate(R.layout.fragment_first, container, false);

        TextView bButtonActivity= v.findViewById(R.id.textView);
        bButtonActivity.setText("FRAGMENT B");
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("TAG Fragment B", "onViewCreated");
//        Button bFirstFragment=view.findViewById(R.id.bSecondFragment);
//        bFirstFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//            }
//        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("TAG Fragment B", "onActivityCreated");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG Fragment B", "onCreate");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e("TAG Fragment B", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("TAG Fragment B", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("TAG Fragment B", "onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment B", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("TAG Fragment B", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("TAG Fragment B", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("TAG Fragment B", "onDetach");
    }
}