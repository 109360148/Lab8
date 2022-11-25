package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.service_start).setOnClickListener(view -> {
            Intent intent = new Intent(this, MyService.class);
            startService(intent);
            Toast.makeText(this, "啟動Service", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}