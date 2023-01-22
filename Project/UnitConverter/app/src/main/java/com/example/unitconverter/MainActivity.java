package com.example.unitconverter;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View view){
        Intent intent=new Intent(this,secondActivity2.class);
        Toast.makeText(MainActivity.this, "Mass Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openActivity3(View view){
        Intent intent=new Intent(this,thirdActivity3.class);
        Toast.makeText(MainActivity.this, "Time Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openActivity4(View view){
        Intent intent =new Intent(this,forthActivity4.class);
        Toast.makeText(MainActivity.this, "Volume Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openActivity5(View view){
        Intent intent=new Intent(this,fifthActivity5.class);
        Toast.makeText(this, "Area Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openActivity6(View view){
        Intent intent=new Intent(this,sixthActivity6.class);
        Toast.makeText(this, "Length Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openActivity7(View view){
        Intent intent=new Intent(this,seventhActivity7.class);
        Toast.makeText(this, "Temperature Converter", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

}
