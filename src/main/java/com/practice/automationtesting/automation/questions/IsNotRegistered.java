package com.practice.automationtesting.automation.questions;

import com.practice.automationtesting.automation.userInterfaces.MyAccountHomePage;
import com.practice.automationtesting.automation.userInterfaces.ThankYouHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsNotRegistered implements Question {

    private String error;

    public IsNotRegistered(String error) {
        this.error = error;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return MyAccountHomePage.ERROR.resolveFor(actor).getText().equals(error);
    }

    public static IsNotRegistered onThePage(String error) {
        return new IsNotRegistered(error);
    }
}
