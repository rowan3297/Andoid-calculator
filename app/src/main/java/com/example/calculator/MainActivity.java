package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView newText;
    Button times,subtract,add,divide;
    String something;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editTextNumber1);
        num2 = findViewById(R.id.editTextNumber2);
        divide = findViewById(R.id.divideButton);
        times = findViewById(R.id.timesButton);
        add = findViewById(R.id.addButton);
        subtract = findViewById(R.id.subtractButton);
        newText = findViewById(R.id.textView);
    }

    public void addNumbers(View view){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = number1 + number2;
        String r = String.valueOf(result);
        newText.setText(r);
    }

    public void divideNumbers(View View){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = number1 / number2;
        String r = String.valueOf(result);
        newText.setText(r);
    }

    public void subtractNumbers(View view){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = number1 - number2;
        String r = String.valueOf(result);
        newText.setText(r);
    }

    public void timesNumbers(View view){
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = number1 * number2;
        String r = String.valueOf(result);
        newText.setText(r);
    }
}