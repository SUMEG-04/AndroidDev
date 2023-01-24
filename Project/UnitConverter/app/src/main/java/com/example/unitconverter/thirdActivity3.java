package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
        String[] options = {"Millisecond ms", "Second s", "Minute min","Hour h","Day d","Week wk","Month mth","Year y"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner=findViewById(R.id.spinner2);
        spinner.setAdapter(adapter);
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Your code here


                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        // Get the selected item from the spinner
                        String selectedItem = spinner.getSelectedItem().toString();

                        // Get the value entered in the EditText
                        String inputValue = editText.getText().toString();

                        if (!inputValue.isEmpty()) {
                            double value = Double.parseDouble(inputValue);

                            if (selectedItem.equals("Millisecond ms")) {
                                double msValue = value;
                                double secValue = msValue * .001;
                                textView8.setText("ms");
                                textView9.setText(String.valueOf(secValue) + "sec.");
                            } else if (selectedItem.equals("Second s")) {
                                // Perform the conversion for second s
                                double secValue = value;
                                double minValue = secValue/60;
                                textView8.setText("s");
                                textView9.setText(String.valueOf(minValue) + "min.");
                            } else if (selectedItem.equals("Minute min")) {
                                // Perform the conversion for minute min
                                double minValue = value;
                                double secValue = minValue * 60;
                                double hValue=minValue/60;
                                textView8.setText("min");
                                textView9.setText(String.valueOf(secValue) + "sec."+"\n"+String.valueOf(hValue)+"hour.");
                            }
                            // Add similar else if statements for the other options
                            else if (selectedItem.equals("Hour h")) {
                                // Perform the conversion for hour h
                                double hValue = value;
                                double secValue= hValue*60*60;
                                double minValue = hValue * 60;
                                double dValue=hValue/24;
                                textView8.setText("h");
                                textView9.setText(String.valueOf(secValue)+"sec."+"\n"+String.valueOf(minValue) + "min."+"\n"+String.valueOf(dValue)+"d.");
                            }
                            else if (selectedItem.equals("Day d")) {
                                // Perform the conversion for day d
                                double dValue = value;
                                double minValue= dValue*24*60;
                                double hValue = dValue * 24;
                                double wkValue=dValue/7;
                                textView8.setText("d");
                                textView9.setText(String.valueOf(minValue)+"min."+"\n"+String.valueOf(hValue) + "h."+"\n"+String.valueOf(wkValue)+"wk.");
                            }
                            else if (selectedItem.equals("Week wk")) {
                                // Perform the conversion for week wk
                                double wkValue = value;
                                double hValue= wkValue*7*24;
                                double dValue = wkValue *7;
                                double mthValue=wkValue/4;
                                textView8.setText("wk");
                                textView9.setText(String.valueOf(hValue)+"h."+"\n"+String.valueOf(dValue) + "d."+"\n"+String.valueOf(mthValue)+"mth.");
                            }
                            else if (selectedItem.equals("Month mth")) {
                                // Perform the conversion for month mth
                                double mthValue = value;
                                double wkValue = mthValue *4;
                                double dValue=mthValue*30;
                                double yValue=mthValue/12;
                                textView8.setText("mth");
                                textView9.setText(String.valueOf(wkValue) + "wk."+"\n"+String.valueOf(dValue)+"d."+"\n"+String.valueOf(yValue)+"y.");
                            }
                            else if (selectedItem.equals("Year y")) {
                                // Perform the conversion for year y
                                double yValue = value;
                                double wkValue = yValue *52;
                                double dValue= yValue*365;
                                double mthValue= yValue*12;
                                textView8.setText("y");
                                textView9.setText(String.valueOf(wkValue) + "wk."+"\n"+String.valueOf(dValue)+"d."+"\n"+String.valueOf(mthValue)+"mth.");
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
        };
        editText.addTextChangedListener(textWatcher);






    }

}