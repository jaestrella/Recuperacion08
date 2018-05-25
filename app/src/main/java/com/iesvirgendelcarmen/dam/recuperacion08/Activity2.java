package com.iesvirgendelcarmen.dam.recuperacion08;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by matinal on 18/05/2018.
 */

public class Activity2 extends AppCompatActivity {
    TextView tv2,tv3,tvValores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tvValores=(TextView)findViewById(R.id.valores);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("name");
            tv2.setText(j);
            String f =(String) b.get("fecha");
            tv3.setText(f);
            ArrayList<String> array = (ArrayList<String>) b.getStringArrayList("valores");
            String v=(String) b.get("valores");

        }

    }
}
