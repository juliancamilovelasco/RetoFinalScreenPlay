package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.userInterfaces.MyAccountHomePage;
import com.practice.automationtesting.automation.userInterfaces.PracticeShopHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickMy implements Task {

     @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PracticeShopHome.MY_ACCOUNT));

    }

    public static ClickMy account() {
        return instrumented(ClickMy.class);
    }
}
