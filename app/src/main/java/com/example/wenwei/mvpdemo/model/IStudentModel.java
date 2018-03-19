package com.example.wenwei.mvpdemo.model;

import java.util.List;

/**
 * Created by liwenwei on 3/19/2018.
 */

public interface IStudentModel {
    // load data
    void loadStudent(StudentOnLoadListener listener);
    interface StudentOnLoadListener{
        void onComplete(List<Student> students);
    }
}
