package com.example.palestinet_shirtdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Interface3Activity extends AppCompatActivity {

    private RadioGroup radioGroupColors;
    private Button buttonCheckout;
    private Button buttonAddToCart;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface3_activity);

        // Initialize views
        radioGroupColors = findViewById(R.id.radioGroupColors);
        buttonCheckout = findViewById(R.id.buttonCheckout);
        buttonAddToCart = findViewById(R.id.buttonAddToCart);
        buttonCancel = findViewById(R.id.buttonCancel);

        buttonAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start Interface3Activity when viewCart button is clicked
                Intent intent = new Intent(Interface3Activity.this, Interface4Activity.class);
                startActivity(intent);
            }
        });

    }
}
