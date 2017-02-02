package com.surya.gamaliel.sampleintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button toSub1, toSub2, toDial;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSub1 = (Button) findViewById(R.id.toSubActivity1);
        toSub2 = (Button) findViewById(R.id.toSubActivity2);
        toDial = (Button) findViewById(R.id.toActivityDial);
        message = (EditText) findViewById(R.id.message);


        toSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        toSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.MESSAGE, message.getText().toString());
                startActivityForResult(intent, 0);
            }
        });

        toDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:031123456789"));
                startActivity(intent);
            }
        });
    }
}
