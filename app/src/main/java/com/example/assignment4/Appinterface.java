package com.example.assignment4;

import com.example.assignment4.example.assignment4.Tweet;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Appinterface {
    @GET("api/?results=15")
    Call<Tweet> getTweets();
}