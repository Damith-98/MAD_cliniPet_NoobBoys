package com.example.clinipetmypartfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class oderUpdateDelete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_update_delete);
    }
    public void odetbttn(View view)
    {
        Intent intent = new Intent(this, payment.class);

        Button ord = (Button) findViewById(R.id.odetbttn);
        String orde = ord.getText().toString();

        intent.putExtra("PAY", orde);

        startActivity(intent);
    }
    public void button5(View view) {
        Intent intent = new Intent(this,FoodOrderDescription.class);

        Button ord = (Button) findViewById(R.id.button5);
        String orde = ord.getText().toString();

        intent.putExtra("update", orde);

        startActivity(intent);
    }
}