package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleListMainActivity extends AppCompatActivity {
    private  ListView listViewEvent;
    private  String[]  EventArray = new String[]{};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewEvent = (ListView) this.findViewById(R.id.MainListview);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, EventArray);

        listViewEvent.setAdapter(stringArrayAdapter);
    }

}
