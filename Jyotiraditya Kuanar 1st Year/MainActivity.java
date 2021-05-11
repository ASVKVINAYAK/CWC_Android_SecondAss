package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import com.mycompany.myapp.R;
import android.view.View;

public class MainActivity extends Activity {
     private EditText num1,num2,num3;
     private TextView T1,T2,T3;
     private  Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=(TextView)findViewById(R.id.textview1);
        T2=(TextView)findViewById(R.id.textview2);
        T3=(TextView)findViewById(R.id.text);
        num1=(EditText)(findViewById(R.id.edittext1));
        num2=(EditText)(findViewById(R.id.edittext2));
        num3=(EditText)(findViewById(R.id.edittext3));
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v){
            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            int multiply=number1+number2;
            num3.setText(String.valueOf(multiply));
          }
        });
        b3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v){
            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            int multiply=number1-number2;
            num3.setText(String.valueOf(multiply));
          }
        });
        b2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v){
            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            int multiply=number1*number2;
            num3.setText(String.valueOf(multiply));
          }
        });
        b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v){
            double number1=Double.parseDouble(num1.getText().toString());
            double number2=Double.parseDouble(num2.getText().toString());
            double multiply=number1/number2;
            num3.setText(String.valueOf(multiply));
          }
        });
    }
}