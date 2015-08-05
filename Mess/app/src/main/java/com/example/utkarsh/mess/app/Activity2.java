package com.example.utkarsh.mess.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends ActionBarActivity {

    MyCustomExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;

    private ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // get the listview
       // expListView = (ExpandableListView) findViewById(R.id.lvExp);
        expandableListView = (ExpandableListView) findViewById(R.id.lvExp);
        // expandableListView.setIndicatorBounds(display.getWidth()-GetDipsFromPixel(40), display.getWidth()-5);
        // preparing list data
        prepareListData();

        listAdapter = new MyCustomExpandableListAdapter(this, listDataHeader, expandableListView);

        // setting list adapter
        expandableListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();


        // Adding child data
        listDataHeader.add("Roti");
        listDataHeader.add("Daal");
        listDataHeader.add("Chawal");

        // Adding child data


    }
}


