package com.example.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class UpdateUser extends AppCompatActivity {

    EditText editTextTextPersonName5;
    EditText editTextTextPersonName6;

    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_update_user);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);

        button16 = findViewById(R.id.button16);
    }
    public void button16 (View view){
        Intent intent = new Intent(this, UserProfile.class);

        Button Reg = (Button) findViewById(R.id.button16);
        String Regs = Reg.getText().toString();

        intent.putExtra("Submit", Regs);

        startActivity(intent);
    }
}