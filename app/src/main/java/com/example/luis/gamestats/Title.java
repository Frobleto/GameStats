package com.example.luis.gamestats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Title extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_title, menu);
        return true;
    }

    public void buttonOnClickA(View v){
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), Basketball.class));
    }

    public void buttonOnClickB(View v){
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), BActivity.class));
    }
    public void buttonOnClickC(View v){
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), DActivity.class));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
