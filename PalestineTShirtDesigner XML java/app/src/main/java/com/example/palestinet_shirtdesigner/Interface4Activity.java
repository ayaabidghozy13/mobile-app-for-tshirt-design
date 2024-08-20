package com.example.palestinet_shirtdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Interface4Activity extends AppCompatActivity {

    private TextView textViewPrice;
    private Button buttonConfirmPurchase;
    private Button buttonAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface4);

        // Initialize views
        textViewPrice = findViewById(R.id.textViewPrice);
        buttonConfirmPurchase = findViewById(R.id.buttonConfirmPurchase);
        buttonAddToCart = findViewById(R.id.buttonAddToCart);

        buttonAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start Interface3Activity when viewCart button is clicked
                Intent intent = new Intent(Interface4Activity.this, Interface5Activity.class);
                startActivity(intent);
            }
        });



    }
}
