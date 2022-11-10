package com.example.clinipets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Pharmacy Select Implement Part
public class PharmacySelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharmacy_select);
    }

    //Button Implement
    public void button2(View view)
    {
        Intent intent = new Intent(this, OrderMedicine.class);

        Button cn = (Button) findViewById(R.id.button2);
        String conf = cn.getText().toString();

        intent.putExtra("CONFIRM", conf);

        startActivity(intent);
    }
}