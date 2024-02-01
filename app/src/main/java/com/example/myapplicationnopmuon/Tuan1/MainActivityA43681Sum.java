package com.example.myapplicationnopmuon.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class MainActivityA43681Sum extends AppCompatActivity {
    EditText A43681eT1, A43681eT2;
    Button A43681bTn1;
    TextView A43681tV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a43681_sum);
        A43681eT1=findViewById(R.id.A43681eT1);
        A43681eT2=findViewById(R.id.A43681eT2);
        A43681bTn1=findViewById(R.id.A43681bTn1);
        A43681tV1=findViewById(R.id.A43681tV1);

        A43681bTn1.setOnClickListener(v->{
            A43681Sum();
        });
    }
    private void A43681Sum()
    {
        String A43681str1=A43681eT1.getText().toString();
        float A43681so1=Float.parseFloat(A43681str1);
        String A43681str2=A43681eT2.getText().toString();
        float A43681so2=Float.parseFloat(A43681str2);
        float A43681Sum=A43681so1+A43681so2;
        A43681tV1.setText((String.valueOf(A43681Sum)));

    }
}