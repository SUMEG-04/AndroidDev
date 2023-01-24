package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class forthActivity4 extends AppCompatActivity {
    Spinner spinner3;
    TextView textView13;
    TextView textView14;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth4);
        Intent intent =getIntent();
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        editText1=findViewById(R.id.editText1);
        editText1.setText("0");
        spinner3=findViewById(R.id.spinner3);
        String[] options={"Cubic meter m3", "Cubic decimeter dm3", "Cubic centimeter cm3","Cubic millimeter mm3","Liter l","Deciliter dl","Centiliter cl","Mililiter ml","Cubic foot ft3","Cubic inch in3","Cubic yard yd3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
        TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String selectedItem=spinner3.getSelectedItem().toString();
                        String inputValue=editText1.getText().toString();

                        if(!inputValue.isEmpty()){
                            double value= Double.parseDouble(inputValue);
                            if (selectedItem.equals("Cubic meter m3")) {
                                double m3Value = value;
                                double secValue = m3Value * .001;
                                textView13.setText("m3");
                                textView14.setText(String.valueOf(secValue) + "sec.");
                            }
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        }

    }
}