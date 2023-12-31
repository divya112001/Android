package com.example.registrationsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fName, lName;
    RadioGroup genderGrp;
    RadioButton Male, Female;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerAndNavigate();
            }
        });
    }

    private void registerAndNavigate() {
        SharedPreferences shardPref=getSharedPreferences("My_Pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=shardPref.edit();

        editor.putString("FName",fName.getText().toString());
        editor.putString("LName",lName.getText().toString());
        String radioValue="";

        int checkedRadioButtonId = genderGrp.getCheckedRadioButtonId();

        if (checkedRadioButtonId == R.id.radioButton6) {
            radioValue = "Male";
        } else if (checkedRadioButtonId == R.id.radioButton7) {
            radioValue = "Female";
        } else {

            radioValue = "Default";
        }

        editor.putString("Gender",radioValue);
        editor.apply();

        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

    private void initUI() {
        fName = findViewById(R.id.editTextText5);
        lName = findViewById(R.id.editTextText6);
        genderGrp = findViewById(R.id.radioGroup);
        Male = findViewById(R.id.radioButton6);
        Female = findViewById(R.id.radioButton7);
        b = findViewById(R.id.button);
    }
}