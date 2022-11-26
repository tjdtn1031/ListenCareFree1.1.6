package com.example.listencarefree;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Quest_Emotion extends AppCompatActivity {

    Call<Django_Item> call;
    TextView textView = findViewById(R.id.quest_emotion_text);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView((R.layout.quest_emotion));

        //Retrofit retrofit = new Retrofit.Builder()
        //        .baseUrl("http://35.72.111.144/emotion/emotion/")
        //        .addConverterFactory(GsonConverterFactory.create())
        //        .build();

        //Django_Api servicel = retrofit.create(Django_Api.class);

        //call = servicel.getPosts("3");

        call = Django_Client.getApiService().getPosts("5");

        call.enqueue(new Callback<Django_Item>() {
            @Override
            public void onResponse(Call<Django_Item> call, Response<Django_Item> response) {
                if(response.isSuccessful()){
                    Django_Item result = response.body();
                    String str;
                    str = result.getTitle()+"\n"+
                            result.getBody()+"\n"+
                            result.getAnswer()+"\n"+
                            result.getAudio();
                    textView.setText(str);
                } else{
                    Log.d(TAG,"onResponse: 실패");
                }
            }

            @Override
            public void onFailure(Call<Django_Item> call, Throwable t){
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });

    }

}