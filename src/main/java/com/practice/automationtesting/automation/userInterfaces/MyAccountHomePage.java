package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountHomePage {

    public static final Target USER = Target.the("User").locatedBy("//input[@id='username']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='password']");
    public static final Target BUTTON_LOGIN = Target.the("Button Login").locatedBy("//input[@class='woocommerce-Button button']");
    public static final Target ERROR = Target.the("Error").locatedBy("//strong[contains(text(),'ERROR')]");


}
