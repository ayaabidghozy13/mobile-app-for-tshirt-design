package com.example.palestinet_shirtdesigner;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Interface5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface5_activity);

        // Display confirmation message
        TextView textViewConfirmation = findViewById(R.id.textViewConfirmation);
        textViewConfirmation.setText("Your order has been confirmed!");
    }
}
