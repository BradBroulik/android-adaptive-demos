package com.example.bradbroulik.adaptivedemos;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.bradbroulik.adaptivedemos.data.AppData;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class HospitalListActivityTest {

    @Rule public final ActivityTestRule<HospitalListActivity> main = new ActivityTestRule<>(HospitalListActivity.class);


    @Test
    public void testHospitalListActivity_whenClinicListItemIsTapped_thenTransitionToDetailViewWithClinicNameShown() {
        // Click the "Mayo Clinic" list item
        onData(allOf(is(instanceOf(AppData.KeyValueItem.class)), hasToString("Mayo Clinic")))   // ObjectMatcher
                .perform(click());                                                              // ViewAction

        // Verify the detail view is shown and displays the name of the selected clinic
        onView(withId(R.id.hospital_detail))                // ViewMatcher
                .check(matches(withText("Mayo Clinic")));   // ViewAssertion
    }

}