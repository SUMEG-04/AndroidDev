package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class thirdActivity3 extends AppCompatActivity {
    Spinner spinner;
    TextView textView9;
    TextView textView8;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);
        Intent intent=getIntent();
        editText=findViewById(R.id.editTextNumberDecimal);
        editText.setText("0");
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        String[] options = {"Millisecond ms", "Second s", "Minute min","Hour h","Day d","Week wk","Month m","Year y"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner=findViewById(R.id.spinner2);
        spinner.setAdapter(adapter);
        spinner .setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).equals("Millisecond ms")){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}