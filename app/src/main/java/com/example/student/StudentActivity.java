package com.example.student;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        int id = getIntent().getIntExtra("id", 0);
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        float age = getIntent().getFloatExtra("age", 0);

        TextView idTextView = findViewById(R.id.id);
        TextView nameTextView = findViewById(R.id.name);
        TextView levelTextView = findViewById(R.id.level);
        TextView ageTextView = findViewById(R.id.age);

        idTextView.setText(id + "");
        nameTextView.setText(name);
        levelTextView.setText(level);
        ageTextView.setText(age + "");


    }
}
