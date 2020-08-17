package com.example.smartfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stef_UpdateProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stef_activity_update_product);
    }

    public void updateproduct(View view) {
        Intent intent1=new Intent(this, stef_ProductMain.class);
        startActivity(intent1);
    }

    /*public void delete(View view) {
        Intent intent1=new Intent(this,ProductMain.class);
        startActivity(intent1);
    }*/
}