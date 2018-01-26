package com.example.hassa.flipflop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HowToPlay extends AppCompatActivity {
    TextView howtoplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        howtoplay=(TextView)findViewById(R.id.howtoplay);
        //howtoplay.setText("");
    }
}
