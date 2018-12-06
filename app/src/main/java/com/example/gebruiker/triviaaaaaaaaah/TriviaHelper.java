package com.example.gebruiker.triviaaaaaaaaah;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.ArrayList;

public class TriviaHelper implements Response.ErrorListener, Response.Listener {

    MainActivity delegate;

    public TriviaHelper(Context context, Activity delegate) {
        this.delegate = (MainActivity) delegate;
        String url = "https://opentdb.com/api.php?amount=10&difficulty=medium&type=multiple";
        RequestQueue queue = Volley.newRequestQueue(context);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null, this, this);
        queue.add(jsonObjectRequest);

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        error.printStackTrace();
    }

    @Override
    public void onResponse(Object response) {
        // response
    }












    private ArrayList<Question> parseJson(String response) {


        return null;
    }


    //
//        JsonObjectRequest jsonObjectRequest1 = new JsonObjectRequest(url, null,
//            new Response.Listener<JSONObject>() {
//                @Override
//                public void onResponse(JSONObject response) {
//                    // response was succesful
//                }
//            },
//            new Response.ErrorListener(){
//                @Override
//                public void onErrorResponse(VolleyError error) {
//
//                }
//            }
//        );


//            if (Build.VERSION.SDK_INT >= 24)
//    {
//        String decoded = Html.fromHtml(response.toString() , Html.FROM_HTML_MODE_LEGACY).toString();
//    }
//        else
//    {
//        String decoded = Html.fromHtml(response.toString()).toString();
//    }

}
