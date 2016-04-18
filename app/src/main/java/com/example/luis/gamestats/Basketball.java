package com.example.luis.gamestats;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Basketball extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }

    public void buttonOnClickTeams(View v){
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), TeamList.class));
    }

}
