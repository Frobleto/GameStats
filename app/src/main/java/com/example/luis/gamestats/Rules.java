package com.example.luis.gamestats;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Rules extends Activity {

    TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);


        // textview for rules
        r = (TextView) findViewById(R.id.textView2);

        loadText();


    }
    private void loadText () {




    }
}
