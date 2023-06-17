package pageEvents;

import basePage.BaseTest;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import utilsPack.ElementFetch;

public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();
    public void verifyLoginPageIsLoaded(){

        Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element is not found");
    }

    public void enterCredentials(){

        ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("gaberial.karsin@donebyngle.com");
        ele.getWebElement("XPATH", LoginPageElements.password).sendKeys("Test@2023");
        ele.getWebElement("XPATH", LoginPageElements.btnLogin).click();

    }

    public void verifyLogin(){
        String getTitle=ele.getWebElement("XPATH", LoginPageElements.titleAfterLogin).getText();
        System.out.println(getTitle);


    }


}
