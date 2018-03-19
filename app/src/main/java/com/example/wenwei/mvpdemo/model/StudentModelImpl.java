package com.example.wenwei.mvpdemo.model;

import android.util.Log;

import com.example.wenwei.mvpdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liwenwei on 3/19/2018.
 */

public class StudentModelImpl implements IStudentModel {
    @Override
    public void loadStudent(StudentOnLoadListener listener) {
        Log.i("mvpdemo","Load the student");
        // Fake data
        List<Student> jsonStu1 = new ArrayList<Student>();
        jsonStu1.add(new Student("Alen ", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("Google", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("Facebook", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("Microsoft", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("Bill", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("David", R.mipmap.ic_launcher));
        // callback
        if (listener != null) {
            listener.onComplete(jsonStu1);
        }
    }
}
