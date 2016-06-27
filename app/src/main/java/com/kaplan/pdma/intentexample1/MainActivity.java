package com.kaplan.pdma.intentexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewLeave = (ImageView)
                findViewById(R.id.imageViewLeave);
        imageViewLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLeave = new Intent(getApplicationContext(),
                        ActivityLeave.class);
                startActivity(intentLeave);
            }
        });

        ImageButton imageButtonStay = (ImageButton)
                findViewById(R.id.imageButtonStay);
        imageButtonStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentStay = new Intent(getApplicationContext(),
                        ActivityStay.class);
                startActivity(intentStay);
            }
        });

    }
}
