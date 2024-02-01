package com.example.myapplicationnopmuon.Tuan2.A43681KL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class A43681Tuan21SecondMainActivity2 extends AppCompatActivity {
    TextView A43681tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43681_tuan21_second_main2);
        A43681tv1=findViewById(R.id.A43681tv1);
        Intent i1=getIntent();
        String A43681str1=i1.getExtras().getString("so1");
        float A43681so1=Float.parseFloat(A43681str1);
        String A43681str2=i1.getExtras().getString("so2");
        float A43681so2=Float.parseFloat(A43681str2);

        float A43681sum=A43681so1+A43681so2;
        A43681tv1.setText(String.valueOf(A43681sum));
    }
}