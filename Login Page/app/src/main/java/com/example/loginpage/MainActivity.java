package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("ALC 1", "onStart Activity Main");
    }


    @Override
    protected void onResume()
    {
        super. onResume();
        Log.d("ALC 1", " onResume Activity Main");
    }

    @Override
    protected void onPause()
    {
        super. onPause();
        Log.d("ALC 1", " onPause Activity Main");
    }

    @Override
    protected void onStop()
    {
        super. onStop();
        Log.d("ALC 1", " onStop Activity Main");
    }

    @Override
    protected void onDestroy()
    {
        super. onDestroy();
        Log.d("ALC 1", " onDestroy Activity Main");
    }
}