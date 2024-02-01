package com.example.myapplicationnopmuon.Tuan2.A43681KL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplicationnopmuon.R;

public class A43681Tuan21MainActivity extends AppCompatActivity {
    EditText A43681txt1, A43681txt2;
    Button A43681btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43681_tuan21_main);
        A43681txt1=findViewById(R.id.A43681txt1);
        A43681txt2=findViewById(R.id.A43681txt2);
        A43681btn1=findViewById(R.id.A43681btn1);
        A43681btn1.setOnClickListener(v->{
            Intent i = new Intent(A43681Tuan21MainActivity.this, A43681Tuan21SecondMainActivity2.class);
            i.putExtra("so1",A43681txt1.getText().toString());
            i.putExtra("so2",A43681txt2.getText().toString());
            startActivity(i);
        });
    }
}