package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;
import android.view.Menu;


public class ActionBarItemsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_items);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_action_bars).split("/")[1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_action_bar_items, menu);
        return true;
    }

}