package com.example.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Symptom extends AppCompatActivity /*implements AppCompatActivity View.OnClickListener */ {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_symptom);

       // Button button11 = findViewById(R.id.button11);

        //button11.setOnClickListener(this);
    }



   /* @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button11:
                Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
                break;


       */
        public void button11 (View view){
            Intent intent = new Intent(this, AddSymptoms.class);

            Button Sym = (Button) findViewById(R.id.button11);
            String Symp = Sym.getText().toString();

            intent.putExtra("BACK", Symp);

            startActivity(intent);
        }
    }
