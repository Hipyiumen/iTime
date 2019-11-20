package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class EventAddActivity extends AppCompatActivity {
    private ArrayList<EventConfig>theEventConfig;
    private ListView listviewAdd;
    private ConfigAdapter theAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_add);

        InitData();

        listviewAdd = (ListView)this.findViewById(R.id.Configlistview);
        theAdapter = new ConfigAdapter(this,R.layout.list_view_config,theEventConfig);
        listviewAdd.setAdapter(theAdapter);

    }

    private void InitData() {
        theEventConfig = new ArrayList<EventConfig>();
        theEventConfig.add(new EventConfig(R.drawable.ic_date,"日期"));
    }

    private class ConfigAdapter extends ArrayAdapter<EventConfig> {
        private int ResId;

        public ConfigAdapter(Context context, int resource, List<EventConfig> objects) {
            super(context, resource, objects);
            ResId = resource;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater mInflater = LayoutInflater.from(this.getContext());

            View view = mInflater.inflate(this.ResId,null);

            TextView configName = view.findViewById(R.id.configDate);
            ImageView configImage = view.findViewById(R.id.DateIcon);

            EventConfig event = this.getItem(position);
            configName.setText(event.getConfig());
            configImage.setImageResource(event.getImageId());
            return view;
        }
    }
//点击Item事件

}


