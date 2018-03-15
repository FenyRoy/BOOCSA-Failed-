package com.ef_corp.boosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void searchbutton(View view)
    {
        Intent i=new Intent(this,Launcher.class);
        startActivity(i);
    }
    public void friendbutton(View view)
    {
        Intent j=new Intent(this,LoginActivity.class);
        startActivity(j);
    }
    public void newbutton(View view)
    {
        Intent k=new Intent(this,Launcher.class);
        startActivity(k);
    }
    public void profilebutton(View view)
    {
        Intent l=new Intent(this,profile.class);
        startActivity(l);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
