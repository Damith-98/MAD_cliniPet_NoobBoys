package com.example.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText editTextTextPersonName;
    EditText editTextTextPersonName2;
    EditText editTextTextPersonName3;
    EditText editTextTextPersonName4;

    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_register);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2= findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3= findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4= findViewById(R.id.editTextTextPersonName4);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

       // setContentView(R.layout.activity_register);
    }
    public void button3 (View view){
        Intent intent = new Intent(this, UserProfile.class);

        Button Reg = (Button) findViewById(R.id.button3);
        String Regs = Reg.getText().toString();

        intent.putExtra("REGISTER", Regs);

        startActivity(intent);
    }
}