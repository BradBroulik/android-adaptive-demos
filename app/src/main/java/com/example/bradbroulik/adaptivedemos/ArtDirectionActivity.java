package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;


public class ArtDirectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_direction);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_art_direction).split("/")[1]);
    }

}