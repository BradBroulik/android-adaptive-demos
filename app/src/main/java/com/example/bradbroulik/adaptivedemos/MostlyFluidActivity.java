package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;


public class MostlyFluidActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostly_fluid);

        getActionBarToolbar();
        getSupportActionBar().setTitle(getString(R.string.title_mostly_fluid).split("/")[1]);
    }

}