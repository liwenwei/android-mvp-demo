package com.example.wenwei.mvpdemo.presenter;

import com.example.wenwei.mvpdemo.model.IStudentModel;
import com.example.wenwei.mvpdemo.model.Student;
import com.example.wenwei.mvpdemo.model.StudentModelImpl;
import com.example.wenwei.mvpdemo.view.IStudentView;

import java.util.List;

/**
 * Created by liwenwei on 3/19/2018.
 */

public class StudentPresenter {
    // Model
    IStudentModel mStudentModel = new StudentModelImpl();
    // View
    IStudentView mStudentView;

    // Initialize the View
    public StudentPresenter(IStudentView mStudentView) {
        this.mStudentView = mStudentView;
    }

    public void fetch() {
        mStudentView.showLoading();

        // Get data from Model
        if (mStudentModel != null) {
            mStudentModel.loadStudent(new IStudentModel.StudentOnLoadListener() {
                @Override
                public void onComplete(List<Student> students) {
                    // Show the data on View
                    mStudentView.showStudents(students);
                }
            });
        }
    }
}
