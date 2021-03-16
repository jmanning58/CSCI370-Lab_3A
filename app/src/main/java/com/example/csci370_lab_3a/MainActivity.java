package com.example.csci370_lab_3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.csci370_lab_3a.Student;


public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private LayoutInflater mInflator;
    //private ArrayList<Student> mDataSource;

    Student firstStudent = new Student("Alli", "Witheren", "Biology");
    Student secondStudent = new Student("George", "Baruso", "Spanish");
    Student thirdStudent = new Student("Danni", "Sykes", "Sociology");
    Student fourthStudent = new Student("Alex", "Mitchel", "History");
    Student fifthStudent = new Student("Sarah", "Stapleton", "Dance");

    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);

        StudentAdapter adapter = new StudentAdapter(getApplicationContext(), students);
    }
}