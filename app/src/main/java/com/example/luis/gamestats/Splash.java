package com.example.luis.gamestats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by jr_raiders_23 on 5/1/16.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        // created new Thread for Splash screen
        Thread thread1 = new Thread(){

            @Override
            public void run (){
                try {

                    // amount of time for splash screen to run in milliseconds
                    sleep(6000);

                    //intent to start title screen after spplash
                    Intent startMain = new Intent(getApplicationContext(), Title.class);
                    startActivity(startMain);
                    finish ();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread1.start();
    }
}
