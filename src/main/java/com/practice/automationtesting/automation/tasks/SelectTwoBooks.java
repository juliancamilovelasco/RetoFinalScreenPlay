package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.userInterfaces.AndroidQuickStartGuideHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectTwoBooks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("2").into(AndroidQuickStartGuideHomePage.SELECT_TWO_BOOKS));
        actor.attemptsTo(Click.on(AndroidQuickStartGuideHomePage.ADD_TO_BASKET));
        actor.attemptsTo(Click.on(AndroidQuickStartGuideHomePage.VIEW_BASKET));

    }

    public static SelectTwoBooks selectTwoBooks() {
        return instrumented(SelectTwoBooks.class);
    }
}
