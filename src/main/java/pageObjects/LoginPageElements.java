package pageObjects;

import utilsPack.ElementFetch;

public interface LoginPageElements {
    String loginText = "//div[contains(text(),'Login')]";
    String emailAddress="//input[@placeholder='Email']";
    String password="//input[@placeholder='Password']";

}
