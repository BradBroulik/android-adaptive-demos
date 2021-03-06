package com.example.bradbroulik.adaptivedemos;

import android.os.Bundle;


/**
 * An activity representing a single Book detail screen. This
 * activity is only used on handset devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link HospitalListActivity}.
 * <p/>
 * This activity is mostly just a 'shell' activity containing nothing
 * more than a {@link HospitalDetailFragment}.
 */
public class HospitalDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_detail);

        getActionBarToolbar();
        getSupportActionBar().setTitle(R.string.title_detail);

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(HospitalDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(HospitalDetailFragment.ARG_ITEM_ID));
            HospitalDetailFragment fragment = new HospitalDetailFragment();
            fragment.setArguments(arguments);
//            fragment.setArguments(getIntent().getExtras());  A simpler way of forwarding the extras (replaces lines 37-41).
            getFragmentManager().beginTransaction()
                    .add(R.id.hospital_detail_container, fragment)
                    .commit();
        }
    }
}