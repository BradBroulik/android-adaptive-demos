package com.example.bradbroulik.adaptivedemos;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

public abstract class BaseActivity extends ActionBarActivity {

    // Primary toolbar and drawer toggle
    private Toolbar mActionBarToolbar;


    Toolbar getActionBarToolbar() {
        if (mActionBarToolbar == null) {
            mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
            if (mActionBarToolbar != null) {
                setSupportActionBar(mActionBarToolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                mActionBarToolbar.setNavigationIcon(R.drawable.ic_action_back);
            }
        }
        return mActionBarToolbar;
    }

}