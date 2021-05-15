package com.SecondAss.BasicCalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num1,num2;
private Button add,sub,mul,div;
    private TextView TV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TV1 = (TextView) findViewById(R.id.tv1);
        TextView TV2 = (TextView) findViewById(R.id.tv2);
        TV3=(TextView)findViewById(R.id.tv3);
        TextView TV4 = (TextView) findViewById(R.id.tv4);
        num1=(EditText)(findViewById(R.id.edt1));
        num2=(EditText)(findViewById(R.id.edt2));
        add=(Button)findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sum=number1+number2;
                TV3.setText(String.valueOf(sum));
            }
        });
        sub=(Button)findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sub=number1-number2;
                TV3.setText(String.valueOf(sub));
            }
        });
        mul=(Button)findViewById(R.id.button3);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int mul=number1*number2;
                TV3.setText(String.valueOf(mul));
            }
        });
        div=(Button)findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int div=number1/number2;
                TV3.setText(String.valueOf(div));
            }
        });

    }
}