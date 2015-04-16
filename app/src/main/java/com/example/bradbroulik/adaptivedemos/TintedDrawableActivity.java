package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;

public class TintedDrawableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinted_drawable);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_tinted_drawable).split("/")[1]);
    }

}