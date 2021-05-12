package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber,editTextNumber2;
    private Button button,button3,button4,button5,button6,button7,button8;
    private TextView editTextNumber3,editTextTextPersonName,editTextTextPersonName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber=(EditText) findViewById(R.id.editTextNumber);
        editTextNumber2=(EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3=(EditText) findViewById(R.id.editTextNumber3);
    }
    public void buttonadd(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int add = n1 + n2;
        editTextNumber3.setText(String.valueOf(add));
    }
    public void buttonsub(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int sub = n1 - n2;
        editTextNumber3.setText(String.valueOf(sub));
    }
    public void buttonmult(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int mult = n1 * n2;
        editTextNumber3.setText(String.valueOf(mult));
    }
    public void buttondiv(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int div = n1 / n2;
        editTextNumber3.setText(String.valueOf(div));
    }
    public void buttonmod(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int mod = n1 % n2;
        editTextNumber3.setText(String.valueOf(mod));
    }
    public void buttonpow(View view) {
        int n1 = Integer.parseInt(editTextNumber.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());
        int pow = n1 ^ n2;
        editTextNumber3.setText(String.valueOf(pow));
    }
}