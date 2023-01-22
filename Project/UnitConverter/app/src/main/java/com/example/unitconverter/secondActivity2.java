package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class secondActivity2 extends AppCompatActivity {
    Spinner spinner;
    EditText editText;
    TextView textView6;
    TextView textView7;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Intent intent=getIntent();
        EditText editText= findViewById(R.id.editText);
        editText.setText("0");
        textView6 = findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        String[] options = {"Kg", "Pound", "Tonne"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).equals("Kg")){
                    double kgValue=Double.parseDouble(editText.getText().toString());
                    double gramValue=kgValue*1000;
                    textView7.setText("kg");
                    textView6.setText(String.valueOf(gramValue)+"grams.");

                }

                else if(adapterView.getItemAtPosition(i).equals("Pound")){
                    double PoundValue=Double.parseDouble(editText.getText().toString());
                    double kgValue=PoundValue*2.205;
                    textView7.setText("lbs");
                    textView6.setText(String.valueOf(kgValue)+"Kg.");

                }

                else if(adapterView.getItemAtPosition(i).equals("Tonne")){
                    double TonneValue=Double.parseDouble(editText.getText().toString());
                    double kgValue=TonneValue*907.185;
                    textView7.setText("t");
                    textView6.setText(String.valueOf(kgValue)+"kg.");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                double kgValue=Double.parseDouble(editText.getText().toString());
                double gramValue=kgValue*1000;
                textView7.setText("Kg");
                textView6.setText(String.valueOf(gramValue)+"gram");
            }
        });

    }
}