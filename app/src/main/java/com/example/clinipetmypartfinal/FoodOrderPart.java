package com.example.clinipetmypartfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FoodOrderPart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order_part);
    }
    public void shop2img(View view)
    {
        Intent intent = new Intent(this, FoodSelectPage.class);

        ImageView im2 = findViewById(R.id.shop2img);
        int imag = im2.getImageAlpha();

        intent.putExtra("ON", imag);

        startActivity(intent);
    }
}