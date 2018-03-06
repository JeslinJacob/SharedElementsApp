package com.example.blackmask.sharedelementsapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private ImageView imgLogo;
private TextView txvShared;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = (ImageView) findViewById(R.id.icon_img);

        txvShared = (TextView) findViewById(R.id.text_txt);
    }

    public void sharedElementTransition(View view) {

        Pair[] pair = new Pair[2];
        pair[0] = new Pair<View, String>(imgLogo, "shared_icon");
        pair[1] = new Pair<View, String>(txvShared, "Shared_txt");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options =ActivityOptions.makeSceneTransitionAnimation(this,pair);
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i,options.toBundle());
        }
    }
}
