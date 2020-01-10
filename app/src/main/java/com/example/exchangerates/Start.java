package com.example.exchangerates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView imgg=findViewById(R.id.imgg);
        TextView t1=findViewById(R.id.maintext);
        TextView t2=findViewById(R.id.fertxt);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        imgg.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
        t2.startAnimation(anim);
        imgg.startAnimation(anim);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                startActivity(new Intent(Start.this,MainActivity.class));
                finish();
            }
        }, 4000);
    }
}

