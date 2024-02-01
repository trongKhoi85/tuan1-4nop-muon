package com.example.myapplicationnopmuon.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplicationnopmuon.R;

import java.util.ArrayList;

public class A43681Tuan3MainActivity extends AppCompatActivity {
    ListView A43681lv;
    A43681_T3_Adapter adapter;
    ArrayList<A43681T3Contact> A43681ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43681_tuan3_main);
        A43681lv=findViewById(R.id.A43681Lv);
        A43681ls.add(new A43681T3Contact("Nguyen Van a","20", R.drawable.ic_launcher_background));
        A43681ls.add(new A43681T3Contact("Nguyen Van c","20", R.drawable.ic_launcher_background));
        A43681ls.add(new A43681T3Contact("Nguyen Van f","20", R.drawable.ic_launcher_background));
        A43681ls.add(new A43681T3Contact("Nguyen Van t","20", R.drawable.ic_launcher_background));
        adapter=new A43681_T3_Adapter(A43681ls,this);
        A43681lv.setAdapter(adapter);
    }
}