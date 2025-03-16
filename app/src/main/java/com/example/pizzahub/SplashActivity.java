package com.example.pizzahub;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.concurrent.ThreadLocalRandom;
public class SplashActivity extends AppCompatActivity{
    private  ImageView logo;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView( R.layout.activity_splash);
       ImageView bar=findViewById(R.id.bar);
        Thread t = new Thread(){
            @Override
            public void run() {
                RotateAnimation rotateAnimation =new RotateAnimation(0,360, RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(5000);
                bar.startAnimation(rotateAnimation);
            }
        };

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        t1.start();

    }
}
