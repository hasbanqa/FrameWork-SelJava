package pageEvents;

import pageObjects.HomePageElements;
import utilsPack.ElementFetch;

public class HomePageEvents {
    ElementFetch ele = new ElementFetch();

    public void signInButton(){
        ele.getWebElement("XPATH", HomePageElements.signInButton).click();


    }


}
