package com.example.clinipetmypartfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodOrderDescription extends AppCompatActivity {
TextView value;
int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order_description);
        value = findViewById(R.id.textView20);
    }
    @SuppressLint("SetTextI18n")
    public void increment(View v){
        count++;
        value.setText(""+count);
    }
    @SuppressLint("SetTextI18n")
    public void decrement(View v){
        if (count <= 0) count = 0;
        else count--;
        value.setText(""+count);
    }
    public void button(View view)
    {
        Intent intent = new Intent(this, oderUpdateDelete.class);

        Button ord = (Button) findViewById(R.id.button);
        String orde = ord.getText().toString();

        intent.putExtra("CONFIRM", orde);

        startActivity(intent);
    }

}