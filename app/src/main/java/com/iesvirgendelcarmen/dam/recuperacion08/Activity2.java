package com.iesvirgendelcarmen.dam.recuperacion08;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by matinal on 18/05/2018.
 */

public class Activity2 extends AppCompatActivity {
    private TextView mTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mTv = (TextView) findViewById(R.id.texto2);

        Bundle extras = getIntent().getExtras();

        mTv.setText(extras.get("fecha").toString() + "\n");
        mTv.append(extras.get("Primavera").toString() + "\n");
        mTv.append(extras.get("Verano").toString() + "\n");
        mTv.append(extras.get("Otoño").toString() + "\n");
        mTv.append(extras.get("Invierno").toString() + "\n");

    }
}
