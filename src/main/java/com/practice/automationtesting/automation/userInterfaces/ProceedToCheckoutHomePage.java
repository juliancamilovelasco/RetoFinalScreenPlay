package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProceedToCheckoutHomePage {

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Proceed To Checkout").locatedBy("//a[@class='checkout-button button alt wc-forward']");
}
