package com.example.heitorcolangelo.espressotests.InstrumentedTests.ListOfUsers.robots;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;

public class ListOfUsersRobot extends ScreenRobot<ListOfUsersRobot> {

    private static final int SCREEN_SCROLL = R.id.recycler_view;
    private static final int TOP_SCREEN_NAME = R.id.action_bar;

    public ListOfUsersRobot goScrollDown(){
        scrollViewDown(SCREEN_SCROLL);
        return this;
    }


    public ListOfUsersRobot checkTestForId(String teste){
        checkViewContainsText(teste);
        return this;
    }

}
