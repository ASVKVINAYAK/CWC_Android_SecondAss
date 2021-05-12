package com.example.calculator_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private TextView output;
    private TextView firstNum;
    private TextView secNum;
    private double val1;
    private double val2;
    private double func;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupOfViews();

        btnAdd.setOnClickListener(v -> {
            func = add();
            output.setText(String.valueOf(func));
        });

        btnSub.setOnClickListener(v -> {
            func = sub();
            output.setText(String.valueOf(func));
        });

        btnMul.setOnClickListener(v -> {
            func = mul();
            output.setText(String.valueOf(func));
        });

        btnDiv.setOnClickListener(v -> {
            func = div();
            output.setText(String.valueOf(func));
         });

    }
    private void setupOfViews(){
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        output = (TextView)findViewById(R.id.editTextNumberOutput);
        firstNum = (TextView)findViewById(R.id.editTextNumber1);
        secNum = (TextView)findViewById(R.id.editTextNumber2);

    }
    private double add(){
        val1 = Double.parseDouble(firstNum.getText().toString());
        val2 = Double.parseDouble(secNum.getText().toString());
        return (val1 + val2);

    }
    private double sub(){
        val1 = Double.parseDouble(firstNum.getText().toString());
        val2 = Double.parseDouble(secNum.getText().toString());
        return val1 - val2;
    }
    private double mul(){
        val1 = Double.parseDouble(firstNum.getText().toString());
        val2 = Double.parseDouble(secNum.getText().toString());
        return val1 * val2;
    }private double div(){
        val1 = Double.parseDouble(firstNum.getText().toString());
        val2 = Double.parseDouble(secNum.getText().toString());
        return val1 / val2;
    }




}