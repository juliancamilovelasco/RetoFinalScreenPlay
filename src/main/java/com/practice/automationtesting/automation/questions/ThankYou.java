package com.practice.automationtesting.automation.questions;

import com.practice.automationtesting.automation.userInterfaces.ThankYouHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ThankYou implements Question {

    private String message;

    public ThankYou(String message){
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return ThankYouHomePage.THANK_YOU.resolveFor(actor).getText().equals(message);

    }

    public static ThankYou thankYouMessage(String message) {
        return new ThankYou(message);
    }
}
