package com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.robots;

import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.constants.LoginConstants;
import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;
import static com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.constants.LoginConstants.HINT_EMAIL;
import static com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.constants.LoginConstants.HINT_PASSWORD;

public class LoginRobot extends ScreenRobot<LoginRobot> {

    private static final int BUTTON_LOGIN = R.id.login_button;
    private static final int FIELD_EMAIL = R.id.login_username;
    private static final int FIELD_PASSWORD = R.id.login_password;

    public LoginRobot pressContinue(){
        clickOnView(BUTTON_LOGIN);
        return this;
    }

 public LoginRobot writeEmail(String email){
     return enterTextIntoView(FIELD_EMAIL, email)
             .closeKeyboard();
    }

    public LoginRobot writePassword(String pass){
        return enterTextIntoView(FIELD_PASSWORD, pass)
                .closeKeyboard();
    }

    public LoginRobot checkButtonLoginIsClickable(){
        checkIsClickable(BUTTON_LOGIN);
        return this;
    }

    public LoginRobot checkButtonIsDisplayed(){
        checkIsDisplayed(BUTTON_LOGIN);
        return this;
    }

    public LoginRobot checkHintForEmailField(){
        checkViewHasHint(FIELD_EMAIL, HINT_EMAIL);
        return this;
    }

    public LoginRobot checkHintForPasslField(){
        checkViewHasHint(FIELD_PASSWORD, HINT_PASSWORD);
        return this;
    }

    public LoginRobot assertErrorDialog(){
        return checkDialogWithTextIsDisplayed(LoginConstants.TEST);
    }

}


