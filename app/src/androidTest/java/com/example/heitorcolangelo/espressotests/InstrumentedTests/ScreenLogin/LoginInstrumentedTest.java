package com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin;
import android.support.test.rule.ActivityTestRule;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.constants.LoginConstants;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.robots.LoginRobot;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

public class LoginInstrumentedTest {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void LoginWithSuccess() throws Exception {
        new LoginRobot()
                .writeEmail(LoginConstants.EMAIL_SUCCESS)
                .writePassword(LoginConstants.PASS_SUCCESS)
                .pressContinue()
                .sleep(10);
    }
    @Ignore
    @Test
    public void VerifyElements() throws Exception {
        new LoginRobot()
                .checkButtonLoginIsClickable()
                .checkButtonIsDisplayed()
                .checkHintForEmailField()
                .checkHintForPasslField();
    }
    @Ignore
    @Test
    public void ClickContinueButton() throws Exception {
        new LoginRobot()
                .pressContinue()
                .assertErrorDialog()
                .pressBack()
                .writeEmail(LoginConstants.EMAIL_SUCCESS)
                .pressContinue()
                .assertErrorDialog()
                .pressBack()
                .writePassword(LoginConstants.PASS_SUCCESS)
                .pressContinue();
    }
}
