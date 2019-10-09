package ru.gav.www.calculatortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    TextView textViewResult;
    EditText editTextFirstValue;
    EditText editTextSecondValue;
    RadioButton radioButtonPlus;
    RadioButton radioButtonMinus;
    RadioButton radioButtonMultiply;
    RadioButton radioButtonDivide;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
        editTextFirstValue = (EditText) findViewById(R.id.editTextFirstValue);
        editTextSecondValue = (EditText) findViewById(R.id.editTextSecondValue);
        radioButtonPlus = (RadioButton) findViewById(R.id.radioButtonPlus);
        radioButtonMinus = (RadioButton) findViewById(R.id.radioButtonMinus);
        radioButtonMultiply = (RadioButton) findViewById(R.id.radioButtonMultiply);
        radioButtonDivide = (RadioButton) findViewById(R.id.radioButtonDivide);
        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
    }

    public void clickButtonCalculate(View view) {
        int num1 = Integer.parseInt(editTextFirstValue.getText().toString());
        int num2 = Integer.parseInt(editTextSecondValue.getText().toString());
        if (radioButtonPlus.isChecked()) {
            textViewResult.setText("="+(num1 + num2));
        } else if (radioButtonDivide.isChecked()) {
            textViewResult.setText("="+(num1 / num2));
        } else if (radioButtonMinus.isChecked()) {
            textViewResult.setText("="+(num1 - num2));
        } else if (radioButtonMultiply.isChecked()) {
            textViewResult.setText("="+(num1 * num2));
        }
    }
}
