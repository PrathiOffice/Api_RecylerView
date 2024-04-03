package com.kee.api_integration;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {

    @GET("/posts")
    Call<List<Model>> getAllData();
}
//http://localhost:3000/patientDetails