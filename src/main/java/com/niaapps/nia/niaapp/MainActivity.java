package com.niaapps.nia.niaapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.widget.ImageButton;
//import android.view.Menu;

public class MainActivity extends Activity {
    ImageButton home, contact, about;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home = (ImageButton) findViewById(R.id.bHome);
        contact = (ImageButton) findViewById(R.id.bContact);
        about = (ImageButton) findViewById(R.id.bAbout);



        about.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://niaapplications.wordpress.com/about/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
         });

        contact.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Uri uri = Uri.parse("https://niaapplications.wordpress.com/contact/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }


        });
        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://niaapplications.wordpress.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


}
}

//Is supposed to be inside " public void onCreate(Bundle savedInstanceState) {" but isn't finished yet. work on later 2 } up
         //   @Override
           // public boolean onCreateOptionsMenu(Menu menu) {
             //   getMenuInflater().inflate(R.menu.menu_main, menu);
               // return true;
            //}








