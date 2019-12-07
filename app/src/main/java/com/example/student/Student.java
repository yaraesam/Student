package com.example.student;

public class Student {

    int id;
    String name;
    String level;
    float age;


    public Student(int id, String name, String level, float age) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}
