package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result, textView;
    private EditText input1, input2;
    private Button add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        result=(TextView) findViewById(R.id.result);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s1 = input1.getText().toString();
                    int n1 = Integer.parseInt(s1);
                    String s2 = input2.getText().toString();
                    int n2 = Integer.parseInt(s2);
                    int n = n1 + n2;
                    result.setText("Result"+n);
                }
            });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=input1.getText().toString();
                int n1=Integer.parseInt(s1);
                String s2=input2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n=n1-n2;
                result.setText("Result: "+n);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=input1.getText().toString();
                int n1=Integer.parseInt(s1);
                String s2=input2.getText().toString();
                int n2=Integer.parseInt(s2);
                int n=n1*n2;
                result.setText("Result: "+n);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=input1.getText().toString();
                double n1=Double.parseDouble(s1);
                String s2=input2.getText().toString();
                int n2=Integer.parseInt(s2);
                double n=n1/n2;
                String s=""+n;
                result.setText("Result: "+s);
            }
        });
    }
}