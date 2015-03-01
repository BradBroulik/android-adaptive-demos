package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.bradbroulik.adaptivedemos.data.AppData;


public class GridViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.grid_view_item,
                R.id.grid_view_cell1,
                AppData.HOSPITALS));
    }

}