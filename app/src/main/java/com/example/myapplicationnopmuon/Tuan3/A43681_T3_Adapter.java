package com.example.myapplicationnopmuon.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

import java.util.ArrayList;

public class A43681_T3_Adapter extends BaseAdapter {
    private ArrayList<A43681T3Contact> A43681ls;
    private Context context;

    public A43681_T3_Adapter(ArrayList<A43681T3Contact> a43681ls, Context context) {
        A43681ls = a43681ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return A43681ls.size();
    }

    @Override
    public Object getItem(int position) {
        return A43681ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        A43681ViewAX A43681ax;
        if(convertView==null)
        {
            A43681ax = new A43681ViewAX();
            convertView= LayoutInflater.from(context).inflate(R.layout.a43681t3_listview_item,null);
            A43681ax.img_hinh=convertView.findViewById(R.id.A43681ItemImage);
            A43681ax.tv_name=convertView.findViewById(R.id.A43681t3ItemName);
            A43681ax.tv_age=convertView.findViewById(R.id.A43681ItemAge);
            convertView.setTag(A43681ax);
        }else
        {
            A43681ax=(A43681ViewAX) convertView.getTag();
        }
        A43681ax.img_hinh.setImageResource(A43681ls.get(position).getA43681image());
        A43681ax.tv_name.setText(A43681ls.get(position).getA43681name());
        A43681ax.tv_age.setText(A43681ls.get(position).getA43681age());
        return convertView;
    }

    class A43681ViewAX{
        ImageView img_hinh;
        TextView tv_name, tv_age;
    }
}
