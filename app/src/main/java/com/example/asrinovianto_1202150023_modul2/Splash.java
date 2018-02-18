package com.example.asrinovianto_1202150023_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    //Untuk mengatur berapa lama untuk melakukan splash dalam satuan milisecond
    private static int splashInterval = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this,"ASRI NOVIANTO,1202150023",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i); // menghubungkan splashActivity dengan mainActivity dengan menggunakan intent
                //jeda selesai Splashscreen
            }
        }, splashInterval);

    }

    ;
}