package com.example.myapplicationnopmuon.Tuan4;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A43681Volleyfn {
    String A43681json="";
    public void getJsonArrayObject(Context context, TextView textView)
    {
        RequestQueue queue= Volley.newRequestQueue(context);
        String url="http://172.19.201.38/aserver/api.php";
        JsonArrayRequest request=new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                    for(int i = 0; i < response.length(); i++){
                        try {
                            JSONObject fashion=response.getJSONObject(i);
                            String brands_filter_facet=fashion.getString("brands_filter_facet");
                            String product_additional_info=fashion.getString("product_additional_info");
                            A43681json+="brands_filter_facet: "+brands_filter_facet+"\n";
                            A43681json+="product_additional_info: "+product_additional_info+"\n";
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
           queue.add(request);
    }
}
