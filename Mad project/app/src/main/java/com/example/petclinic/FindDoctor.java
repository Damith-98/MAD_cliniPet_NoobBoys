package com.example.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class FindDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_find_doctor);
    }
    public void button5(View view){
        Intent intent = new Intent(this,DoctorProfile.class);

        Button Doc = (Button) findViewById(R.id.button5);
        String Doct= Doc.getText().toString();

        intent.putExtra("DR.DAMITH",Doct);

        startActivity(intent);

    }
    public void button4(View view){
        Intent intent = new Intent(this,register.class);

        Button Doc = (Button) findViewById(R.id.button4);
        String Doct= Doc.getText().toString();

        intent.putExtra("BACK",Doct);

        startActivity(intent);

    }

}