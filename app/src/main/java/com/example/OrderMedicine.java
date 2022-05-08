package com.example.clinipets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderMedicine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_medicine);
    }

    public void button6(View view)
    {
        Intent intent = new Intent(this, OrderedMedicineDetails.class);

        Button conf = (Button) findViewById(R.id.button6);
        String con = conf.getText().toString();

        intent.putExtra("CONFIRM", con);

        startActivity(intent);
    }
}