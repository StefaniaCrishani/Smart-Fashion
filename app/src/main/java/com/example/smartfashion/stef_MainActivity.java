package com.example.smartfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stef_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stef_activity_main);
    }

    public void AddProduct(View view) {
        Intent intent1=new  Intent(this, stef_ProductMain.class);
        startActivity(intent1);
    }


}