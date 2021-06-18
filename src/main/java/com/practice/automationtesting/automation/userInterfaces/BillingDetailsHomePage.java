package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BillingDetailsHomePage {


    public static final Target FIRST_NAME = Target.the("First Name").locatedBy("//*[@id='billing_first_name']");
    public static final Target LAST_NAME = Target.the("Last Name").locatedBy("//*[@id='billing_last_name']");
    public static final Target EMAIL_ADDRESS= Target.the("Email Address").locatedBy("//*[@id='billing_email']");
    public static final Target PHONE= Target.the("Phone").locatedBy("//*[@name='billing_phone']");
    public static final Target ADDRESS = Target.the("Address").locatedBy("//*[@name='billing_address_1']");
    public static final Target CITY= Target.the("City").locatedBy("//*[@name='billing_city']");
    public static final Target COUNTRY= Target.the("Country").locatedBy("//*[@name='billing_state']");
    public static final Target DIRECT_BANK_TRANSFER= Target.the("Bank Option").locatedBy("//*[@id='payment_method_bacs']");
    public static final Target PLACE_ORDER= Target.the("Place Order").locatedBy("//*[@id='place_order']");
}
