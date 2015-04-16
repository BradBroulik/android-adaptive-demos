package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;


public class ScreenDensityActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_density);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_device_density).split("/")[1]);
    }

}