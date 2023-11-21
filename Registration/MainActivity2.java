package com.example.registrationsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData();
            }
        });

    }

    private void fetchData() {
        SharedPreferences sharedPref=getSharedPreferences("My_Pref",MODE_PRIVATE);
        tv1.setText("First Name : "+sharedPref.getString("FName",""));
        tv2.setText("Last Name : "+sharedPref.getString("LName",""));
        tv3.setText("Gender: "+sharedPref.getString("Gender",""));

    }

    private void initUI() {
        btn=findViewById(R.id.button3);
        tv1=findViewById(R.id.textView3);
        tv2=findViewById(R.id.textView4);
        tv3=findViewById(R.id.textView5);
    }
    }
