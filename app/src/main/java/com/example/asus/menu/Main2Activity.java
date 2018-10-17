package com.example.asus.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String ingredients = intent.getStringExtra("Ingredients");
        String process = intent.getStringExtra("Process");
        TextView tingredients = findViewById(R.id.resep_ingredients);
        tingredients.setText(ingredients);
        TextView tprocess = findViewById(R.id.resep_process);
        tprocess.setText(process);
    }

}
