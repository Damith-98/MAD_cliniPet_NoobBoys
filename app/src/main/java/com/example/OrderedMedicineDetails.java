package com.example.clinipets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderedMedicineDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordered_medicine_details);
    }

    public void button7(View view)
    {
        Intent intent = new Intent(this, MedicineOrderDeleteUpdate.class);

        Button confi = (Button) findViewById(R.id.button7);
        String conf = confi.getText().toString();

        intent.putExtra("CONFIRM", conf);

        startActivity(intent);
    }
}