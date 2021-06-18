package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.userInterfaces.BillingDetailsHomePage;
import com.practice.automationtesting.automation.userInterfaces.ThankYouHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaymentMethod implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BillingDetailsHomePage.DIRECT_BANK_TRANSFER));
        actor.attemptsTo(Click.on(BillingDetailsHomePage.PLACE_ORDER));
        actor.attemptsTo(Ensure.that(ThankYouHomePage.THANK_YOU).isDisplayed());

    }

    public static PaymentMethod payment() {
        return instrumented(PaymentMethod.class);
    }
}
