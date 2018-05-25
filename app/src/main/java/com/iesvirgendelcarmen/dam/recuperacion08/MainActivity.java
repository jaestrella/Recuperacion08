package com.iesvirgendelcarmen.dam.recuperacion08;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button boton;
    TextView tv1,tvDate,valor1,valor2,valor3,valor4,valor5,valoresTotales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.boton);
        tv1=(TextView)findViewById(R.id.tv1);
        tvDate = (TextView) findViewById(R.id.tvDate);
        valor1=(TextView)findViewById(R.id.v1);
        valor2=(TextView)findViewById(R.id.v2);
        valor3=(TextView)findViewById(R.id.v3);
        valor4=(TextView)findViewById(R.id.v4);
        valor5=(TextView)findViewById(R.id.v5);
        valoresTotales=(TextView)findViewById(R.id.valoresTotales);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv1.getText().toString();

                SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
                String date = sdf.format(new Date(System.currentTimeMillis()));
                tvDate.setText(date);
                String f=tvDate.getText().toString();

                String v1=valor1.getText().toString();
                String v2=valor2.getText().toString();
                String v3=valor3.getText().toString();
                String v4=valor4.getText().toString();
                String v5=valor5.getText().toString();
                ArrayList<String> array = new ArrayList<String>();
                array.add(v1);
                array.add(v2);
                array.add(v3);
                array.add(v4);
                array.add(v5);

                Intent intent=new Intent(getApplication(),Activity2.class);
                intent.putExtra("name",s);
                intent.putExtra("fecha",f);
                intent.putStringArrayListExtra("myArr",array);
                startActivity(intent);
            }
        });
    }
}
