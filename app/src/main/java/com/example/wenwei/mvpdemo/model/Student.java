package com.example.wenwei.mvpdemo.model;

/**
 * Created by liwenwei on 3/19/2018.
 */

public class Student {

    private String name;
    private int stuImg;

    public Student() {
    }

    public Student(String name, int stuImg) {
        this.name = name;
        this.stuImg = stuImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuImg() {
        return stuImg;
    }

    public void setStuImg(int stuImg) {
        this.stuImg = stuImg;
    }

}
