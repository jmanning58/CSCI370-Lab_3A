package com.example.csci370_lab_3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView students;
    private Context mContext;
    private LayoutInflater mInflator;
    //private ArrayList<Student> mDataSource;

    String[] studentFirstName = {"Alli", "George", "Danni", "Alex", "Sarah"};
    String[] studentLastName = {"Witheren", "Baruso", "Sykes", "Mitchel", "Stapleton"};
    String[] majors = {"Biology", "Spanish", "History", "Sociology", "Dance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}