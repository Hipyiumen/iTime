package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        private ArrayList<MainListView>theEventMain;
        private ListView listViewSuper;
        private EventAdater theAdapter;


        @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitData();

        listViewSuper = (ListView)this.findViewById(R.id.MainListview);
        theAdapter = new EventAdater(this,R.layout.list_view_item_main,theEventMain);
        listViewSuper.setAdapter(theAdapter);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EventAddActivity.class);
                startActivity(intent);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void InitData() {
        theEventMain = new ArrayList<MainListView>();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
        }
        else if (id == R.id.nav_tools) {
        }
        else if (id == R.id.nav_about) {

        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   protected class EventAdater extends ArrayAdapter<MainListView> {
        private int resId;
        public EventAdater(Context context, int resource,List<MainListView>objects) {
           super(context, resource, objects);
           resId = resource;
       }

       @Override
       public View getView(int position, View convertView, ViewGroup parent) {
           LayoutInflater mInflater = LayoutInflater.from(this.getContext());
           MainListView event = this.getItem(position);
           View view = mInflater.inflate(this.resId,null);

           TextView eventTitle = view.findViewById(R.id.textViewTitle);
           TextView eventDate = view.findViewById(R.id.textViewDate);
           TextView eventRemark = view.findViewById(R.id.textViewRemark);
           ImageView eventImage = view.findViewById(R.id.imageView);

           eventTitle.setText(event.getEventTitle());
           eventDate.setText(event.getEventDate());
           eventRemark.setText(event.getEventRemark());
           eventImage.setImageResource(event.getEventImageId());
           return view;
       }
   }
}
