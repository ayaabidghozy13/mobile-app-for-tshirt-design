package com.example.palestinet_shirtdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Interface2Activity extends AppCompatActivity {

    private ImageView imageViewDesign1, imageViewDesign2, imageViewDesign3, imageViewDesign4;
    private Button viewCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);

        // Initialize views
        imageViewDesign1 = findViewById(R.id.imageViewDesign1);
        imageViewDesign2 = findViewById(R.id.imageViewDesign2);
        imageViewDesign3 = findViewById(R.id.imageViewDesign3);
        imageViewDesign4 = findViewById(R.id.imageViewDesign4);
        viewCart = findViewById(R.id.buttonViewCart);

        // Set OnClickListener for viewCart button
        viewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start Interface3Activity when viewCart button is clicked
                Intent intent = new Intent(Interface2Activity.this, Interface3Activity.class);
                startActivity(intent);
            }
        });
    }
}
