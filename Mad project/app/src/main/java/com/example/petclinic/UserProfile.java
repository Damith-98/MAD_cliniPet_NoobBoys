package com.example.petclinic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class UserProfile extends AppCompatActivity {

    //Firebase Database
    private FirebaseAuth cAuth;
    private DatabaseReference cPetsDatabase;

    //Delete Text
    private  EditText textView17;
    private EditText  TextView18;

    //Delete button
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_user_profile);
    }
    public void button13 (View view){
        Intent intent = new Intent(this, UpdateUser.class);

        Button Reg = (Button) findViewById(R.id.button13);
        String Regs = Reg.getText().toString();

        intent.putExtra("Update", Regs);

        startActivity(intent);
    }
    public void button15 (View view){
        Intent intent = new Intent(this, AddSymptoms.class);

        Button Reg = (Button) findViewById(R.id.button15);
        String Regs = Reg.getText().toString();

        intent.putExtra("Home", Regs);

        startActivity(intent);
    }
}