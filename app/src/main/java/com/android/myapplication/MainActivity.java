package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.myapplication.retrofit.model.TodoBean;
import com.android.myapplication.retrofit.service.TodoApi;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getNetworkComponent().inject(this);

        TodoApi service = retrofit.create(TodoApi.class);
        service.getTodos(1).enqueue(new Callback<TodoBean>() {
            @Override
            public void onResponse(Call<TodoBean> call, Response<TodoBean> response) {
                Log.d(TAG, "onResponse: ....");
            }

            @Override
            public void onFailure(Call<TodoBean> call, Throwable t) {
                Log.d(TAG, "onFailure: .....");
            }
        });

    }
}