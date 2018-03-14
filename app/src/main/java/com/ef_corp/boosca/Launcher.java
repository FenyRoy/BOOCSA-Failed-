package com.ef_corp.boosca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Launcher extends AppCompatActivity {

    LinearLayout linearLayout;
    Animation uptodown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        linearLayout =(LinearLayout)findViewById(R.id.launch);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.slide_down);
        linearLayout.setAnimation(uptodown);
    }
}
