package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String str[]={"This is","Item1","Item2","Item3","Item4","Item5","Item6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        //ArrayAdapter a1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,str);
        //listview.setAdapter(a1);
        customAdapter ad=new customAdapter(this,R.layout.custom_adapter,str);
        listview.setAdapter(ad);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}