package com.example.rubenirimia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Arranque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);




        ImageView logoSplash = findViewById(R.id.logoSplash);
        TextView appNameSplash = findViewById(R.id.appNameSplash);

        Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        logoSplash.startAnimation(zoomAnimation);

        Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        appNameSplash.startAnimation(fadeAnimation);
        Animation shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);
        appNameSplash.startAnimation(shakeAnimation);



        ImageView background = findViewById(R.id.backgroundSplash);
       //RequestBuilder<Drawable> a = Glide.with(this).load("https://images.unsplash.com/photo-1526248283201-fafd30eb2b90?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
       //a.centerCrop().into(background);

        Glide.with(this)
                .load("https://images.unsplash.com/photo-1526248283201-fafd30eb2b90?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .into(background);
        openAcceso();

    }

    public void openAcceso(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, Acceso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }



}