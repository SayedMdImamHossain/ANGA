package com.example.anga.bottomnavigation;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class navigation_support_bottomTest {

    @Rule
    public ActivityScenarioRule<navigation_support_bottom> mActivityScenarioRule =
            new ActivityScenarioRule<>(navigation_support_bottom.class);

    @Test
    public void navigation_support_bottomTest() {
    }
}
