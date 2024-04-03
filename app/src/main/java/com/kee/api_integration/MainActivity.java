package com.kee.api_integration;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager linearLayoutManager;
    PostAdapter postAdapter;
    List<Model> modelList = new ArrayList<> ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        EdgeToEdge.enable ( this );
        setContentView ( R.layout.activity_main );


        recyclerView = findViewById ( R.id.recyler_view );
        progressBar = findViewById ( R.id.progess_bar );
        linearLayoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager (linearLayoutManager );
        postAdapter = new PostAdapter ( modelList );
        recyclerView.setAdapter ( postAdapter );

        fetchPosts();


    }

    private void fetchPosts(){
        progressBar.setVisibility ( View.VISIBLE );
        RetrofitClient.getRetrofitInstance ().getAllData ().enqueue ( new Callback<List<Model>> () {
            @Override
            public void onResponse(Call<List<Model>> call , Response<List<Model>> response) {
                if(response.isSuccessful () && response.body() !=null){
                    modelList.addAll ( response.body () );
                    postAdapter.notifyDataSetChanged ();
                    progressBar.setVisibility ( View.GONE );
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call , Throwable throwable) {
               progressBar.setVisibility ( View.GONE );
                Toast.makeText ( MainActivity.this,"Error"+ throwable.getMessage (),Toast.LENGTH_LONG).show ();
            }
        } );
    }
}