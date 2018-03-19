package com.example.wenwei.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.wenwei.mvpdemo.adapter.StudentAdapter;
import com.example.wenwei.mvpdemo.model.Student;
import com.example.wenwei.mvpdemo.presenter.StudentPresenter;
import com.example.wenwei.mvpdemo.view.IStudentView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IStudentView {

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = (ListView) findViewById(R.id.my_list);
        new StudentPresenter(this).fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "Loading the data......", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStudents(List<Student> students) {
        myList.setAdapter(new StudentAdapter(MainActivity.this, students));
    }
}
