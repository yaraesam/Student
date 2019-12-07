package com.example.student;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView notes_rv;
    StudentsAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        notes_rv = findViewById(R.id.notes_rv);
        notes_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentsAdapter(this, studentList);
        notes_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList.add(new Student(1, "Student  1 Name", "level 1", 22));
        studentList.add(new Student(2, "Student  2 Name", "level 2", 20));
        studentList.add(new Student(3, "Student  3 Name", "level 3", 25));
        studentList.add(new Student(4, "Student  4 Name", "level 4", 23));
        studentList.add(new Student(5, "Student  5 Name", "level 5", 25));
        studentList.add(new Student(6, "Student  6 Name", "level 6", 27));

    }
}
