package com.example.mycal_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextText1 ;
    private EditText editTextText2 ;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextText1 = findViewById(R.id.editTextText1);
        editTextText2 = findViewById(R.id.editTextText2);
        textView3=findViewById(R.id.textView3);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ADDED", Toast.LENGTH_SHORT).show();
                String S1 = editTextText1.getText().toString();
                String S2 = editTextText2.getText().toString();
                Double n1 = Double.parseDouble(S1);
                Double n2 = Double.parseDouble(S2);
                Double sum =n1 + n2;
                textView3.setText("RESULT IS:" + sum);
            }

        });
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SUBTRACTED", Toast.LENGTH_SHORT).show();
                String S3 = editTextText1.getText().toString();
                String S4 = editTextText2.getText().toString();
                Double n3 = Double.parseDouble(S3);
                Double n4 = Double.parseDouble(S4);
                Double diff = n3 - n4;
                textView3.setText("RESULT IS:" + diff);
            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "MULTIPLIED", Toast.LENGTH_SHORT).show();
                String S4 = editTextText1.getText().toString();
                String S5 = editTextText2.getText().toString();
                Double n4 = Double.parseDouble(S4);
                Double n5 = Double.parseDouble(S5);
                Double prd = n4 * n5;
                textView3.setText("RESULT IS:" + prd);
            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DIVIDED", Toast.LENGTH_SHORT).show();
                String S5 = editTextText1.getText().toString();
                String S6 = editTextText2.getText().toString();
                Double n5 = Double.parseDouble(S5);
                Double n6 =Double.parseDouble(S6);
                Double div = n5 / n6;
                textView3.setText("RESULT:" + div);
            }
        });
    }
}