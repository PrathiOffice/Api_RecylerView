package com.kee.api_integration;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL ="https://jsonplaceholder.typicode.com/";

   public static Methods getRetrofitInstance(){
        if(retrofit ==null){
            retrofit = new Retrofit.Builder ()
                    .baseUrl ( BASE_URL )
                    .addConverterFactory(GsonConverterFactory.create())
                    .build ();
        }
        return retrofit.create ( Methods.class );
    }
}
