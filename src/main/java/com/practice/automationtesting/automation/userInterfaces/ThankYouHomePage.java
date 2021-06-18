package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ThankYouHomePage extends PageObject {

    public static final Target THANK_YOU = Target.the("Thank You").locatedBy("//*[@class='woocommerce-thankyou-order-received']");



}
