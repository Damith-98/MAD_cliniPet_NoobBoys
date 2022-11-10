package com.example.clinipets;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class PetProfileDelete extends AppCompatActivity
{

    //Firebase Database
    private FirebaseAuth cAuth;
    private DatabaseReference cPetsDatabase;

    //Delete Text
    private EditText edtNameDetails;
    private EditText edtVaccineDetails;
    private EditText edtOwnerDetails;

    //Delete Button Add
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet_profile_delete);

        button = findViewById(R.id.button);
    }

    /*
    protected void deleteProfile()
    {
        AlertDialog.Builder mydialog = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View myview = inflater(R.layout.pet_profile_delete, null);

        edtNameDetails = myview.findViewById(R.id.editTextTextMultiLine3);
        edtVaccineDetails = myview.findViewById(R.id.editTextTextMultiLine4);
        edtOwnerDetails = myview.findViewById(R.id.editTextTextMultiLine5);

        button = myview.findViewById(R.id.button);

        AlertDialog dialog = mydialog.create();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cPetsDatabase.child(post_key).removeValue();
                dialog.dismiss();

                Intent intent = new Intent(getActivity(), HomePage.class);
                startActivity(intent);
            }
        });

        dialog.show();
    }*/

    public void button(View view)
    {
        Intent intent = new Intent(this, PharmacySelect.class);

        Button delPro = (Button) findViewById(R.id.button);
        String dpr = delPro.getText().toString();

        intent.putExtra("DELETE PROFILE", dpr);

        startActivity(intent);
    }
}