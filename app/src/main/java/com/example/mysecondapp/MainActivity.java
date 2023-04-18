package com.example.mysecondapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.button);
        Random random=new Random();
        button.setOnClickListener(view -> textView.setText(Integer.toString(random.nextInt(6)+1)));

    }

}