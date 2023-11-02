package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtno1,txtno2,txtresult;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtno1 = findViewById(R.id.txtno1);
        txtno2 = findViewById(R.id.txtno2);
        txtresult = findViewById(R.id.txtresult);

        btn1 = findViewById(R.id.btn1);

    }

    public void sum(View view) {
        float n1=Float.parseFloat(txtno1.getText().toString());
        float n2=Float.parseFloat(txtno2.getText().toString());
        float s=n1+n2;
        txtresult.setText(Float.toString(s));


    }

    public void substraction(View view) {
        float n1=Float.parseFloat(txtno1.getText().toString());
        float n2=Float.parseFloat(txtno2.getText().toString());
        float s = n1 - n2;
        txtresult.setText(Float.toString(s));

    }

    public void division(View view) {
        float n1=Float.parseFloat(txtno1.getText().toString());
        float n2=Float.parseFloat(txtno2.getText().toString());
        float s=n1/n2;
        txtresult.setText(Float.toString(s));


    }


    public void multiplication(View view) {
        float n1=Float.parseFloat(txtno1.getText().toString());
        float n2=Float.parseFloat(txtno2.getText().toString());
        float s=n1*n2;
        txtresult.setText(Float.toString(s));


    }



}