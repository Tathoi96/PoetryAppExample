package com.example.poetryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

Button btnKoi,btnDont,btnMegh,btnBroken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnKoi=findViewById(R.id.btn_koi);
        btnDont=findViewById(R.id.btn_dont);
        btnMegh=findViewById(R.id.btn_megh);
        btnBroken=findViewById(R.id.btn_broken);


        btnKoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("poetry","koi");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Koi Toh Ho", Toast.LENGTH_SHORT).show();
            }
        });

        btnDont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("poetry","don't");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Don't Give Up", Toast.LENGTH_SHORT).show();
            }
        });

        btnMegh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("poetry","megh");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Megh Bollo", Toast.LENGTH_SHORT).show();
            }
        });


        btnBroken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("poetry","broken");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Broken But Beautiful", Toast.LENGTH_SHORT).show();
            }
        });


    }
}