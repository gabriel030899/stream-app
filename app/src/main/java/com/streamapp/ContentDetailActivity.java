package com.streamapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContentDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_detail);

        String titulo = getIntent().getStringExtra("titulo");
        String descricao = getIntent().getStringExtra("descricao");

        TextView titleView = findViewById(R.id.title);
        TextView descView = findViewById(R.id.description);

        titleView.setText(titulo);
        descView.setText(descricao);
    }
}