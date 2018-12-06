package com.example.renske.trivibeeeeeeeeee;

import android.content.Context;
import android.support.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class TriviaHelperPost implements Response.Listener<String>, Response.ErrorListener {

    public TriviaHelperPost(Context context) {

        String url = "sampleurl.com/post";
        RequestQueue queue = Volley.newRequestQueue(context);
        PostRequest request = new PostRequest(Request.Method.POST, url, this, this);
        queue.add(request);

    }

    /*
        Inner class representing the String request of type POST. Notice the method
        getParams() that is overridden in this class.
    */
    private class PostRequest extends StringRequest  {

        public PostRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
            super(method, url, listener, errorListener);
        }

        @Override
        protected Map<String, String> getParams() {

            Map<String, String> params = new HashMap<>();
            params.put("name", "Minor Programmeren");
            params.put("studentcount", "300");
            return params;
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        error.printStackTrace();
    }

    @Override
    public void onResponse(String response) {
        // do something with the response
    }
}
