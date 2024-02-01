package com.example.myapplicationnopmuon.Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class A43681T4MainActivity extends AppCompatActivity {
    Button A43681btn;
    TextView A43681tv;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43681_t4_main);
        A43681Volleyfn Volleyfn=new A43681Volleyfn();
        A43681btn=findViewById(R.id.A43681btn);
        A43681tv=findViewById(R.id.A43681Tv);
        A43681btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Volleyfn.getJsonArrayObject(context,A43681tv);
            }
        });

    }
}