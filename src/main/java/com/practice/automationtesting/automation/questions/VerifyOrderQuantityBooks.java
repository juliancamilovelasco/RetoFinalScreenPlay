package com.practice.automationtesting.automation.questions;


import com.practice.automationtesting.automation.userInterfaces.VerifyOrderHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyOrderQuantityBooks implements Question {

        private String value;

        public VerifyOrderQuantityBooks(String value){
            this.value = value;
        }

    public static VerifyOrderQuantityBooks verify(String value){
        return new VerifyOrderQuantityBooks(value);
    }


    @Override
    public Object answeredBy(Actor actor) {
        System.out.println("Valor que contiene 'value' :" + value);
        return VerifyOrderHomePage.VERIFY_SELECT_TWO_BOOKS.resolveFor(actor).getText().equals(value);
    }
}
