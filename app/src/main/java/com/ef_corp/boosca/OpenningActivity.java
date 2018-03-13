package com.ef_corp.boosca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class OpenningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openning);
        ImageView image =findViewById(R.id.idImageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_bottom);
        image.startAnimation(animation);
    }
}
