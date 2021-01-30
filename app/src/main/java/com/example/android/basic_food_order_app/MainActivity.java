package com.example.android.basic_food_order_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String order="ordermy";
    public void placeorder(View view)
    {
        Intent intent=new Intent(this, Orderpage.class);
        EditText editText1= findViewById(R.id.editTextTextPersonName2);
        EditText editText2= findViewById(R.id.editTextTextPersonName3);
        EditText editText3= findViewById(R.id.editTextTextPersonName4);
        String message ="Hey Order for" +editText1.getText().toString() +" "+editText2.getText().toString()+" "+editText3.getText().toString()+" placed successfully";
        intent.putExtra(order,message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}