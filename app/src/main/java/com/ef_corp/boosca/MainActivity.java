package com.ef_corp.boosca;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView Entry1;

   /* public void searchbutton(View view)
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
    } */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 //       setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_launcher);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        Entry1 = findViewById(R.id.Title);

        Entry1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, LoginPage.class);
                startActivity(intent);

            }
        });
    }
}
