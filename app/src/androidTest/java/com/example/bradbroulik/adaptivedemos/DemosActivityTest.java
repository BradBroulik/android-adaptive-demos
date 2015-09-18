package com.example.bradbroulik.adaptivedemos;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class DemosActivityTest {

    @Rule public final ActivityTestRule<DemosActivity> main = new ActivityTestRule<>(DemosActivity.class);


    @Test
    public void testDemosActivity_whenLaunched_thenDisplayExpectedToolbarTitle() throws Exception {
        onView(allOf(isDescendantOfA(withId(R.id.toolbar_actionbar)), withText(R.string.app_name)))
                .check(matches(isDisplayed()));
    }

}