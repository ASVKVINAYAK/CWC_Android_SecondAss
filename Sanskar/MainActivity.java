package com.excessiveMedia.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstEt,secondEt,resultEt;
    private Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstEt = findViewById(R.id.firstEt);
        secondEt = findViewById(R.id.secondEt);
        resultEt = findViewById(R.id.resultEt);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);


        add.setOnClickListener(v->{
             float num1 = Float.parseFloat(firstEt.getText().toString());
             float num2 = Float.parseFloat(secondEt.getText().toString());
             resultEt.setText(String.valueOf(num1+num2));
        });
        sub.setOnClickListener(v->{
             float num1 = Float.parseFloat(firstEt.getText().toString());
             float num2 = Float.parseFloat(secondEt.getText().toString());
             resultEt.setText(String.valueOf(num1-num2));
        });
        mul.setOnClickListener(v->{
             float num1 = Float.parseFloat(firstEt.getText().toString());
             float num2 = Float.parseFloat(secondEt.getText().toString());
             resultEt.setText(String.valueOf(num1*num2));
        });
        div.setOnClickListener(v->{
             float num1 = Float.parseFloat(firstEt.getText().toString());
             float num2 = Float.parseFloat(secondEt.getText().toString());
             if(num2==0){
                 resultEt.setText("Second number cannot be 0 ");
             }else
             resultEt.setText(String.valueOf(num1/num2));
        });

    }
}