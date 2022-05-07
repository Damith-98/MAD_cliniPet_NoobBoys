package com.example.clinipetmypartfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FoodSelectPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select_page);
    }
    public void imageView3(View view)
    {
        Intent intent = new Intent(this, FoodOrderDescription.class);

        ImageView d1 = findViewById(R.id.imageView3);
        int dscp = d1.getImageAlpha();

        intent.putExtra("dcrption", dscp);

        startActivity(intent);
    }
}