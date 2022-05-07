package com.example.clinipetmypartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void odr_food(View view)
    {
        Intent intent = new Intent(this, FoodOrderPart.class);

        ImageView im1 = findViewById(R.id.echnl);
        int ima = im1.getImageAlpha();

        intent.putExtra("CLICK", ima);

        startActivity(intent);
    }
}