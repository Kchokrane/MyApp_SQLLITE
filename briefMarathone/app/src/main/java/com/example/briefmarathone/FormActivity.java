package com.example.briefmarathone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class FormActivity extends AppCompatActivity{


    EditText nom,prenom,age,adresse,tele,email;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
        age=findViewById(R.id.age);
        adresse=findViewById(R.id.address);
        tele=findViewById(R.id.Phone);
        email=findViewById(R.id.email);





    }



    public void submit(View view) {
        if(nom.getText().toString().trim().equals("") || prenom.getText().toString().trim().equals("") || age.getText().toString().trim().equals("")  ||adresse.getText().toString().trim().equals("") || tele.getText().toString().trim().equals("")  || tele.getText().toString().trim().equals("")  || email.getText().toString().trim().equals(""))
        {
            Toast.makeText(getApplicationContext(), "il manque des informations", Toast.LENGTH_LONG).show();
        }
        else
        {
            startActivity(new Intent(FormActivity.this,PageActivity.class));

        }
    }
}
