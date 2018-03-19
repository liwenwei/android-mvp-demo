package com.example.wenwei.mvpdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wenwei.mvpdemo.R;
import com.example.wenwei.mvpdemo.model.Student;

import java.util.List;

/**
 * Created by liwenwei on 3/19/2018.
 */

public class StudentAdapter extends BaseAdapter {

    private LayoutInflater myInflater;
    private List<Student> data;

    public StudentAdapter(Context context, List<Student> data) {
        myInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = data.get(position);
        View stuView = myInflater.inflate(R.layout.student_item, null);
        ImageView imgStu = (ImageView) stuView.findViewById(R.id.img_stu);
        imgStu.setImageResource(student.getStuImg());
        TextView tvStu = (TextView) stuView.findViewById(R.id.tv_name);
        tvStu.setText(student.getName());
        return stuView;
    }
}
