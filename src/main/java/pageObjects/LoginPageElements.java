package pageObjects;

import utilsPack.ElementFetch;

public interface LoginPageElements {
    String loginText = "//div[contains(text(),'Login')]";
    String emailAddress="//input[@placeholder='Email']";
    String password="//input[@placeholder='Password']";

    String btnLogin = "//div[contains(text(),'Login')]";

    String titleAfterLogin = "//body/div[@id='ui']/div/div/div[@id='top-header-menu']/div[1]";

}
