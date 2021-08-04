package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
        //EditText,Button,TextView are the views or variables ,so in order to work with them
        //you need to import it in mainactivity.java

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //declaring the values
    EditText etFirstValue,etSecondValue;    //EditText is a datatype etFirstValue and etSecond Value are the variables
     TextView tvAns;    //TextView is the datatype,tvans is the variable
    Button add,subtract,multiply,divide;    //Button is a datatype and add,subtract,multiply,divide are the varaibles

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //Initializing the variables or views
        etFirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);
        add=findViewById(R.id.btnAdd);
        subtract=findViewById(R.id.btnSubtract);
        multiply=findViewById(R.id.btnMultiply);
        divide=findViewById(R.id.btnDivide);
        //the variables etFirstVAlue and etSecondValue are the in the form of type Edit,so we need to convert it into a Strign then we need to convert it into an integer.
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue+secondValue;
                tvAns.setText("Ans is ="+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue-secondValue;
                tvAns.setText("Ans is ="+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue*secondValue;
                tvAns.setText("Ans is ="+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue/secondValue;
                tvAns.setText("Ans is ="+ans);
            }
        });
    }
}
