package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.assignment4.example.assignment4.Tweet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Tweets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweets);
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/posts").addConverterFactory(GsonConverterFactory.create()).build();
        Appinterface service = retrofit.create(Appinterface.class);
        Call<Tweet> call = service.getTweets();
        call.enqueue(new Callback<Tweet>() {
            @Override
            public void onResponse(Call<Tweet> call, Response<Tweet> response) {
                Tweet results = response.body();
            }

            @Override
            public void onFailure(Call<Tweet> call, Throwable t) {

            }
        });


}
}