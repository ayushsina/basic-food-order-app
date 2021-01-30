package com.example.android.basic_food_order_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Orderpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.order);
        TextView textView=findViewById(R.id.textView2);
        textView.setText(message);
    }
}