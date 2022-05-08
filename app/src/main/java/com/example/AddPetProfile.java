package com.example.clinipets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddPetProfile extends AppCompatActivity {

    //Variables Declare
    EditText editTextTextPersonName11;
    EditText editTextTextPersonName12;
    EditText editTextTextPersonName13;
    EditText editTextTextPersonName14;
    EditText editTextTextPersonName15;
    EditText editTextTextPersonName16;

    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;

    EditText editTextTextPersonName17;
    EditText editTextTextPersonName18;
    EditText editTextTextPersonName19;

    Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_pet_profile);
        editTextTextPersonName11 = findViewById(R.id.editTextTextPersonName11);
        editTextTextPersonName12 = findViewById(R.id.editTextTextPersonName12);
        editTextTextPersonName13 = findViewById(R.id.editTextTextPersonName13);
        editTextTextPersonName14 = findViewById(R.id.editTextTextPersonName14);
        editTextTextPersonName15 = findViewById(R.id.editTextTextPersonName15);
        editTextTextPersonName16 = findViewById(R.id.editTextTextPersonName16);

        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        editTextTextPersonName17 = findViewById(R.id.editTextTextPersonName17);
        editTextTextPersonName18 = findViewById(R.id.editTextTextPersonName18);
        editTextTextPersonName19 = findViewById(R.id.editTextTextPersonName19);

        button11 = findViewById(R.id.button11);


    }

    //Data Retrieve
    public void onClick (View view)
    {
        Intent intent = new Intent(this, PetProfileDelete.class);
        intent.putExtra("nu1", editTextTextPersonName11.getText().toString());
        intent.putExtra("nu2", editTextTextPersonName12.getText().toString());
        intent.putExtra("nu3", editTextTextPersonName13.getText().toString());
        intent.putExtra("nu4", editTextTextPersonName14.getText().toString());
        intent.putExtra("nu5", editTextTextPersonName15.getText().toString());
        intent.putExtra("nu6", editTextTextPersonName16.getText().toString());
        intent.putExtra("nu7", checkBox.getText().toString());
        intent.putExtra("nu8", checkBox2.getText().toString());
        intent.putExtra("nu9", checkBox3.getText().toString());
        startActivity(intent);

    }

}