package com.example.csci370_lab_3a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import com.example.csci370_lab_3a.Student;

public class StudentAdapter {

    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context context, ArrayList<Student> students) {
        mContext = context;
        mDataSource= students;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {return mDataSource.size();}

    @Override
    public Object getItem(int position) {return mDataSource.get(position);}

    @Override
    public long getItemId(int position) {return position;}

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);

        TextView firstName = rowView.findViewById(R.id.first_name);
        TextView lastName = rowView.findViewById(R.id.last_name);
        TextView major = rowView.findViewById(R.id.major);

        Student student = (Student) getItem(postion);
        firstName.setText(student.getFirstName());
        lastName.setText(student.getLastName());
        major.setText(student.getMajor());

        return rowView;
    }
}
