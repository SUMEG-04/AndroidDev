package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class fifthActivity5 extends AppCompatActivity {
    Spinner inputSpinner;
    Spinner outputSpinner;
    EditText editText;
    TextView textView;
    TextView textView1;
    TextView textView2;
    Button convert;
    double finalVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth5);
        inputSpinner=findViewById(R.id.spinner3);
        outputSpinner=findViewById(R.id.spinner4);
        editText=findViewById(R.id.editTextNumberDecimal2);
        editText.setText("0");
        textView=findViewById(R.id.textView13);
        textView1=findViewById(R.id.textView12);
        textView1.setText("0.0");
        textView2=findViewById(R.id.textView15);
        String[] option={"Square meter m2","Square decimeter dm2","Square centimeter cm2","Square millimeter mm2"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,option);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        inputSpinner.setAdapter(adapter);
        outputSpinner.setAdapter(adapter);
        convert=findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        inputSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                outputSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    String inputUnit=inputSpinner.getSelectedItem().toString();
                    String outputUnit=outputSpinner.getSelectedItem().toString();
                    String inputValue=editText.getText().toString();
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!inputValue.isEmpty()){

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
}