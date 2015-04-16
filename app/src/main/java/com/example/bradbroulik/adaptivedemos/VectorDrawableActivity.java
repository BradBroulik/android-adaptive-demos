package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;


public class VectorDrawableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_drawable);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_vector_drawable).split("/")[1]);
    }

}