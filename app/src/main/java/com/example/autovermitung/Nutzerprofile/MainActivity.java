package com.example.autovermitung.Nutzerprofile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.autovermitung.R;

public class MainActivity extends AppCompatActivity {
     private static int SPLASH_Screen=5000;
    // Variables to add animation
    Animation bottomAnim;
    TextView logo,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide State Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Animation


        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks

        logo=findViewById(R.id.textView1);
        slogan=findViewById(R.id.textView2);

        //Assign Animation to image and text

        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, Login.class);
                 startActivity(intent);
                 finish();
            }
        },SPLASH_Screen);
    }
}