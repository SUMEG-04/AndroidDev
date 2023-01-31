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
    Spinner inputUnitSpinner;
    Spinner outputUnitSpinner;
    TextView textView14;
    EditText editText1;
    String inputUnit;
    String outputUnit;
    double finalVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth4);
        Intent intent =getIntent();
        textView14=findViewById(R.id.textView14);
        editText1=findViewById(R.id.editText1);
        editText1.setText("0");
        inputUnitSpinner = findViewById(R.id.input_unit_spinner);
        outputUnitSpinner = findViewById(R.id.output_unit_spinner);
        String[] options={"Cubic meter m3", "Cubic decimeter dm3", "Cubic centimeter cm3","Cubic millimeter mm3","Liter l","Deciliter dl","Centiliter cl","Milliliter ml","Cubic foot ft3","Cubic inch in3","Cubic yard yd3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputUnitSpinner.setAdapter(adapter);
        outputUnitSpinner.setAdapter(adapter);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                inputUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        outputUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                String inputUnit = inputUnitSpinner.getSelectedItem().toString();
                                String outputUnit = outputUnitSpinner.getSelectedItem().toString();
                                String inputValue = editText1.getText().toString();
                                if(!inputValue.isEmpty()){
                                    double value=Double.parseDouble(inputValue);
                                    //Cubic meter m3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Liter l")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                    }
                                    //Cucic decimeter dm3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Liter l")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                    }
                                    //Cucic centimeter cm3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Liter l")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic centimeter cm3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Cucic milimeter mm3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Liter l")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Liter l
                                    {
                                        //1
                                        if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic millimeter mm3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Liter l") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Deciliter l
                                    {
                                        //1
                                        if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Deciliter dl") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Deciliter l
                                    {
                                        //1
                                        if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Centiliter cl") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Mililiter l
                                    {
                                        //1
                                        if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Milliliter ml") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Cubic foot ft3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic foot ft3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Cubic inch in3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic inch in3") && outputUnit.equals("Cubic yard yd3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                    //Cubic yard yd3
                                    {
                                        //1
                                        if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic meter m3")) {
                                            double m3val = value;
                                            double dm3val = m3val * 1000;
                                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                                        }
                                        //2
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic decimeter dm3")) {
                                            double m3val = value;
                                            double cm3val = m3val * 1000000;
                                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                                        }
                                        //3
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic centimeter cm3")) {
                                            double m3val = value; // 5 cubic meters
                                            double mm3val = m3val * 1000000000;
                                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                                        }
                                        //4
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic millimeter mm3")) {
                                            double m3Value = value; // the value in m3 that you want to convert
                                            double lval = m3Value * 1000;
                                            textView14.setText(String.valueOf(lval) + " cm3.");
                                        }
                                        //5
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Liter l")) {
                                            double m3val = value;
                                            double dlval = m3val * 10000;
                                            textView14.setText(String.valueOf(dlval) + " cm3.");
                                        }
                                        //6
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Deciliter dl")) {
                                            double m3val = value;
                                            double clval = m3val*100000;
                                            textView14.setText(String.valueOf(clval) + " cm3.");
                                        }
                                        //7
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Centiliter cl")) {
                                            double m3val = value;
                                            double mlval = m3val*1000000;
                                            textView14.setText(String.valueOf(mlval) + " cm3.");
                                        }
                                        //8
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Milliliter ml")) {
                                            double m3val = value;
                                            double ft3val = m3val * 35.3146667;
                                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                                        }
                                        //9
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic foot ft3")) {
                                            double m3val = value;
                                            double in3Val= m3val * 61023.7441;
                                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                                        }
                                        //10
                                        else if (inputUnit.equals("Cubic yard yd3") && outputUnit.equals("Cubic inch in3")) {
                                            double m3val = value;
                                            double yd3val = m3val * 1.3079506;
                                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                                        }
                                        //
//                                        else{
//                                            textView14.setText(editText1.toString());
//                                        }
                                    }
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });




    }
}
/*
TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputValue = editText1.getText().toString();
                if (!inputValue.isEmpty()) {
                    double value = Double.parseDouble(inputValue);
                    //Cubic meter m3
                    {
                        //1
                        if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic decimeter dm3")) {
                            double m3val = value;
                            double dm3val = m3val * 1000;
                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                        }
                        //2
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic centimeter cm3")) {
                            double m3val = value;
                            double cm3val = m3val * 1000000;
                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                        }
                        //3
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic millimeter mm3")) {
                            double m3val = value; // 5 cubic meters
                            double mm3val = m3val * 1000000000;
                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                        }
                        //4
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Liter l")) {
                            double m3Value = value; // the value in m3 that you want to convert
                            double lval = m3Value * 1000;
                            textView14.setText(String.valueOf(lval) + " cm3.");
                        }
                        //5
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Deciliter dl")) {
                            double m3val = value;
                            double dlval = m3val * 10000;
                            textView14.setText(String.valueOf(dlval) + " cm3.");
                        }
                        //6
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Centiliter cl")) {
                            double m3val = value;
                            double clval = m3val*100000;
                            textView14.setText(String.valueOf(clval) + " cm3.");
                        }
                        //7
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Milliliter ml")) {
                            double m3val = value;
                            double mlval = m3val*1000000;
                            textView14.setText(String.valueOf(mlval) + " cm3.");
                        }
                        //8
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic foot ft3")) {
                            double m3val = value;
                            double ft3val = m3val * 35.3146667;
                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                        }
                        //9
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic inch in3")) {
                            double m3val = value;
                            double in3Val= m3val * 61023.7441;
                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                        }
                        //10
                        else if (inputUnit.equals("Cubic meter m3") && outputUnit.equals("Cubic yard yd3")) {
                            double m3val = value;
                            double yd3val = m3val * 1.3079506;
                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                        }
                    }
                    //Cucic decimeter dm3
                    {
                        //1
                        if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic meter m3")) {
                            double m3val = value;
                            double dm3val = m3val * 1000;
                            textView14.setText(String.valueOf(dm3val) + " dm3.");
                        }
                        //2
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic centimeter cm3")) {
                            double m3val = value;
                            double cm3val = m3val * 1000000;
                            textView14.setText(String.valueOf(cm3val) + " cm3.");
                        }
                        //3
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic millimeter mm3")) {
                            double m3val = value; // 5 cubic meters
                            double mm3val = m3val * 1000000000;
                            textView14.setText(String.valueOf(mm3val) + " mm3.");
                        }
                        //4
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Liter l")) {
                            double m3Value = value; // the value in m3 that you want to convert
                            double lval = m3Value * 1000;
                            textView14.setText(String.valueOf(lval) + " cm3.");
                        }
                        //5
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Deciliter dl")) {
                            double m3val = value;
                            double dlval = m3val * 10000;
                            textView14.setText(String.valueOf(dlval) + " cm3.");
                        }
                        //6
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Centiliter cl")) {
                            double m3val = value;
                            double clval = m3val*100000;
                            textView14.setText(String.valueOf(clval) + " cm3.");
                        }
                        //7
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Milliliter ml")) {
                            double m3val = value;
                            double mlval = m3val*1000000;
                            textView14.setText(String.valueOf(mlval) + " cm3.");
                        }
                        //8
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic foot ft3")) {
                            double m3val = value;
                            double ft3val = m3val * 35.3146667;
                            textView14.setText(String.valueOf(ft3val) + " cm3.");
                        }
                        //9
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic inch in3")) {
                            double m3val = value;
                            double in3Val= m3val * 61023.7441;
                            textView14.setText(String.valueOf(in3Val) + " cm3.");
                        }
                        //10
                        else if (inputUnit.equals("Cubic decimeter dm3") && outputUnit.equals("Cubic yard yd3")) {
                            double m3val = value;
                            double yd3val = m3val * 1.3079506;
                            textView14.setText(String.valueOf(yd3val) + " cm3.");
                        }
                    }

                    // Add similar code for other conversions
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        editText1.addTextChangedListener(textWatcher);*/