package com.example.zoo;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.os.StrictMode;
import android.util.Log;
import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.zoo.R;
import com.example.zoo.adapters.SpeciesItemAdapter;
import com.example.zoo.models.Asia;
import com.example.zoo.models.Continent;
import com.example.zoo.models.Zoo;

import java.util.List;

public class MainActivityJava extends AppCompatActivity{
    private List<Zoo> continent;

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button exit = findViewById(R.id.btn_exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("verificare", "butonul merge");
                finish();

            }
        });


    }}