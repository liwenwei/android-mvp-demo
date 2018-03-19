package com.example.wenwei.mvpdemo.view;

import com.example.wenwei.mvpdemo.model.Student;

import java.util.List;

/**
 * Created by liwenwei on 3/19/2018.
 */

public interface IStudentView {
    // Show the progress
    void showLoading();
    // Show the students data
    void showStudents(List<Student> students);
}
