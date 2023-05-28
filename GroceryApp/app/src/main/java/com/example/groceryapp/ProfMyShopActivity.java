package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

public class ProfMyShopActivity extends AppCompatActivity {

    ImageView backNav;
    Button homeBut;
    Button prodBut;
    Button revBut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_myshop);
        backNav = findViewById(R.id.backNav);

        homeBut = findViewById(R.id.homeBut);
        prodBut = findViewById(R.id.prodBut);
        revBut = findViewById(R.id.revBut);

        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfMyShopActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });

        homeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfMyShopActivity.this, ShopHome.class);
                startActivity(i);

            }

        });

        revBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfMyShopActivity.this, ShopReview.class);
                startActivity(i);

            }

        });
    }

    public void productButton(View v) {
        Intent i = new Intent(ProfMyShopActivity.this, ProductActivity.class);
        startActivity(i);
    }
}