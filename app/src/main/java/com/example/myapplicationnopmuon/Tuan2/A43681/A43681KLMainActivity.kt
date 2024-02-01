package com.example.myapplicationnopmuon.Tuan2.A43681

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplicationnopmuon.R

class A43681KLMainActivity : AppCompatActivity() {
    var A43681txt1:EditText? = null;
    var A43681txt2:EditText? = null;
    var A43681btn1:Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a43681_klmain)
        A43681txt1=findViewById(R.id.A43681KLtxt1)
        A43681txt2=findViewById(R.id.A43681KLtxt2)
        A43681btn1=findViewById(R.id.A43681KLbtn1)
        A43681btn1!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@A43681KLMainActivity, A43681secondMainActivity::class.java);
            i.putExtra("so1", A43681txt1.toString())
            i.putExtra("so2",A43681txt2.toString())
            startActivity(i);
        })
    }
}