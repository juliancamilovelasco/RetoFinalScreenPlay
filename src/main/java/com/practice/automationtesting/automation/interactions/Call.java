package com.practice.automationtesting.automation.interactions;

import com.practice.automationtesting.automation.questions.VerifyOrderQuantityBooks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Call implements Interaction {

    String value;

    public Call(String value) {
        this.value = value;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(VerifyOrderQuantityBooks.verify(value)));
    }

    public static Call question(String value){
        return new Call(value);
    }
}
