package com.example.asus.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WordListDetail extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worlist_item_detail);
        Intent intent = getIntent();
        String ingredients = intent.getStringExtra("Ingredients");
        String process = intent.getStringExtra("Process");

    }
}
