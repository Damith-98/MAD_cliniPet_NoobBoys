package com.example.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddSymptoms extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox6;

    Button button9;
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_add_symptoms);

        checkBox = findViewById(R.id.checkBox);
        checkBox2= findViewById(R.id.checkBox2);
        checkBox3= findViewById(R.id.checkBox3);
        checkBox4= findViewById(R.id.checkBox4);
        checkBox6= findViewById(R.id.checkBox6);

        button9 = findViewById(R.id.button9);
        button10= findViewById(R.id.button10);
    }
    public void button9 (View view){
        Intent intent = new Intent(this, Symptom.class);

        Button Add = (Button) findViewById(R.id.button9);
        String AddS = Add.getText().toString();

        intent.putExtra("DISEASE", AddS);

        startActivity(intent);
    }
    public void button10 (View view){
        Intent intent = new Intent(this, FindDoctor.class);

        Button Fin = (Button) findViewById(R.id.button10);
        String Find = Fin.getText().toString();

        intent.putExtra("FIND DOCTOR", Find);

        startActivity(intent);
    }
}