package com.example.myapplicationnopmuon.Tuan2.A43681

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplicationnopmuon.R

class A43681secondMainActivity : AppCompatActivity() {
    var A43681tv1:TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a43681second_main)
        A43681tv1=findViewById(R.id.A43681tv)
        var i1=intent;
        val A43681str1=i1.extras!!.getString("so1");
        val A43681str2=i1.extras!!.getString("so2");
        val A43681so1=A43681str1!!.toFloat();
        val A43681so2=A43681str2!!.toFloat();
        val A43681sum=A43681so1+A43681so2;
        A43681tv1!!.text=A43681sum.toString();
    }
}