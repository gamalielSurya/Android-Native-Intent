package com.surya.gamaliel.sampleintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity {

    public static String MESSAGE = "message";
    TextView iMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        iMessage = (TextView) findViewById(R.id.myMessage);
        iMessage.setText(getIntent().getStringExtra(MESSAGE));

    }
}
