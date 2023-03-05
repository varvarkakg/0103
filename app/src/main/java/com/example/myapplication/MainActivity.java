package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText number1, number2;
    private Button add_Button;

    @Override
    protected void onCreated(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView =findViewById(R.id.resultTextView3);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        add_Button = findViewById(R.id.add_button);

        add_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number1.getText(). toString());
                float num2 = Float.parseFloat(number2.getText(). toString());
                float res = num1 + num2;
                float res2 = num1 / num2;
                float res3 = num1 - num2;
                float res4 = num1 * num2;
                resultTextView.setText(String.valueOf(res));
            }
        });
    }
}