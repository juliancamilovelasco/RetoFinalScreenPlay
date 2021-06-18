package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.userInterfaces.PracticeShopHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBookToBuy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PracticeShopHome.SELECT_ANDROID_BOOK));

    }

    public static SelectBookToBuy selectBookToBuy() {
        return instrumented(SelectBookToBuy.class);
    }
}
