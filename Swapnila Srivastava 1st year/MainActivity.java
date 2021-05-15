package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private TextView editTextNumber3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber=(EditText) findViewById(R.id.editTextNumber);
        editTextNumber2=(EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3=(TextView) findViewById(R.id.editTextNumber3);
    }
    public void btnadd(View view) {
        int n1=Integer.parseInt(editTextNumber.getText().toString());
        int n2=Integer.parseInt(editTextNumber2.getText().toString());
        int add=n1+n2;
        editTextNumber3.setText(String.valueOf(add));
    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(editTextNumber.getText().toString());
        int n2=Integer.parseInt(editTextNumber2.getText().toString());
        int sub=n1-n2;
        editTextNumber3.setText(String.valueOf(sub));
    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(editTextNumber.getText().toString());
        int n2=Integer.parseInt(editTextNumber2.getText().toString());
        int mul=n1*n2;
        editTextNumber3.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(editTextNumber.getText().toString());
        int n2=Integer.parseInt(editTextNumber2.getText().toString());
        int div=n1/n2;
        editTextNumber3.setText(String.valueOf(div));
    }
}