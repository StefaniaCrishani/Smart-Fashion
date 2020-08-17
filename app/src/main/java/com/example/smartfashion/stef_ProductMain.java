package com.example.smartfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stef_ProductMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stef_activity_product_main);

    }
    public void AddProduct(View view) {

        Intent intent1=new Intent(this, stef_MainActivity.class);
        startActivity(intent1);
    }

    public void delete(View view) {

        Intent intent1=new Intent(this, stef_UpdateProduct.class);
        startActivity(intent1);
    }

    public void updateproduct(View view) {

        Intent intent1=new Intent(this, stef_UpdateProduct.class);
        startActivity(intent1);
    }
}