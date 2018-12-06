package com.example.renske.trivibeeeeeeeeee;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class TriviaHelperArray implements Response.Listener<JSONArray>, Response.ErrorListener {

    public TriviaHelperArray(Context context) {

        String url = "https://opentdb.com/api.php?amount=10&difficulty=medium&type=multiple";
        RequestQueue queue  = Volley.newRequestQueue(context);
        JsonArrayRequest request = new JsonArrayRequest(url, this, this);




    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(JSONArray response) {

    }
}
