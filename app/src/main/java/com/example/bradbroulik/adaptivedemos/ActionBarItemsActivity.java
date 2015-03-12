package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;


public class ActionBarItemsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_items);
        setTitle(getString(R.string.title_action_bars).split("/")[1]);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_action_bar_items, menu);
        return true;
    }

}