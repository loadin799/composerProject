package com.example.heitorcolangelo.espressotests.InstrumentedTests.ListOfUsers;

import android.support.test.espresso.IdlingPolicies;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.heitorcolangelo.espressotests.InstrumentedTests.ListOfUsers.constants.ListOfUsersConstants;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ListOfUsers.robots.ListOfUsersRobot;
import com.example.heitorcolangelo.espressotests.ui.activity.MainActivity;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class ListInstrumentedTest {

    @BeforeClass
    public static void setupClass(){

        IdlingPolicies.setIdlingResourceTimeout(5, TimeUnit.SECONDS);

    }

    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);
    @Ignore
    @Test
    public void ScrollInList() throws Exception {
        new ListOfUsersRobot()
                .sleep(5)
                .checkTestForId(ListOfUsersConstants.TEST)
                .goScrollDown()
                .checkTestForId(ListOfUsersConstants.TEST_TEXTO_FINAL_TELA);
    }
}
