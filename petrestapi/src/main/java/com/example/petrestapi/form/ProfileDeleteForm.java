package com.example.petrestapi.form;

import java.time.LocalDateTime;

public class ProfileDeleteForm {
    private String name;
    private int age;
    private LocalDateTime birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }
}
