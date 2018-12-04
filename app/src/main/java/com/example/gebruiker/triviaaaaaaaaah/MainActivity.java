package com.example.gebruiker.triviaaaaaaaaah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Response.Listener, Response.ErrorListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restTestServer();
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Error.Response", error.getMessage());
    }

    @Override
    public void onResponse(Object response) {
        Log.d("Error.Response", response.toString());
    }

    void restTestServer() {

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://ide50-vluuks1.cs50.io:8080/testlist";
        StringRequest postRequest = new StringRequest(Request.Method.POST, url, this, this) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String> params = new HashMap<>();
                params.put("name", "Tim");
                params.put("knapheid", "ULTIEM MEGA MOOI");
                return params;
            }
        };
        queue.add(postRequest);


        StringRequest putRequest = new StringRequest(Request.Method.PUT, url + "/1", this, this) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String> params = new HashMap<>();
                params.put("surname", "Meijer");
                return params;
            }
        };
        queue.add(putRequest);

        queue.start();
    }
}
