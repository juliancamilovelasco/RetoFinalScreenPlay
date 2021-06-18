package com.practice.automationtesting.automation.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class VerifyOrderHomePage extends PageObject {

    public static final Target VERIFY_SELECT_TWO_BOOKS = Target.the("Verify Select Two Books").locatedBy("//span[contains(text(),'2 items')]");


}
