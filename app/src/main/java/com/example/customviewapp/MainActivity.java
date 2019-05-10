package com.example.customviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View myView;
    private MyCustomView myCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomView = findViewById(R.id.customView);
        myCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCustomView.setTextColor(Color.YELLOW);
                myCustomView.setViewColor(Color.GRAY);
                myCustomView.setViewText("HelloWorld");
            }
        });

      /*  myView = findViewById(R.id.customView);
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}
