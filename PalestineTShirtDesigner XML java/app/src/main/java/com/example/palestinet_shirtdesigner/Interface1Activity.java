package com.example.palestinet_shirtdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Interface1Activity extends AppCompatActivity {
    protected Button login;
    protected EditText text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface1_activity);


        text1=findViewById(R.id.editTextNom);
        text2=findViewById(R.id.editTextPrenom);
        login=findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Interface1Activity.this, Interface2Activity.class);
                startActivity(intent);
            }
        });



    }
}
