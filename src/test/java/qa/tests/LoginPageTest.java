package qa.tests;

import basePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utilsPack.ElementFetch;

public class LoginPageTest extends BaseTest {
    HomePageEvents homePageEvents = new HomePageEvents();
    LoginPageEvents loginPageEvents = new LoginPageEvents();


    @Test()
    public void sampleMethodForEnteringCredentials(){

        homePageEvents.signInButton();
        loginPageEvents.verifyLoginPageIsLoaded();
        loginPageEvents.enterCredentials();

    }
    @Test
    public void verifyLoginIsSuccessful(){
        loginPageEvents.verifyLogin();

    }



}
