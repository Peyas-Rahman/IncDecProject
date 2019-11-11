package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {
    private TextView message_Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        message_Text=findViewById(R.id.msgText);
        String name=getIntent().getStringExtra("key");
        message_Text.setText("Hello "+name+" !!");
    }
}
