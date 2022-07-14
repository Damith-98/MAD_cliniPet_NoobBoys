package com.example.clinipets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicineOrderDeleteUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_order_delete_update);
    }

    public void bttnOrder(View view)
    {
        Intent intent = new Intent(this, MedicinePayment.class);

        Button ord = findViewById(R.id.bttnOrder);
        String orde = ord.getText().toString();

        intent.putExtra("CONFIRM", orde);

        startActivity(intent);
    }
}