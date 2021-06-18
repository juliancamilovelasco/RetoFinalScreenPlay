package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.models.Data;
import com.practice.automationtesting.automation.userInterfaces.BillingDetailsHomePage;
import com.practice.automationtesting.automation.userInterfaces.ProceedToCheckoutHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BillingDetails implements Task {

    Data data;

    public BillingDetails(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.getFirstName()).into(BillingDetailsHomePage.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(data.getLastName()).into(BillingDetailsHomePage.LAST_NAME));
        actor.attemptsTo(Enter.theValue(data.getEmailAddress()).into(BillingDetailsHomePage.EMAIL_ADDRESS));
        actor.attemptsTo(Enter.theValue(data.getPhone()).into(BillingDetailsHomePage.PHONE));
        actor.attemptsTo(Enter.theValue(data.getAddress()).into(BillingDetailsHomePage.ADDRESS));
        actor.attemptsTo(Enter.theValue(data.getCity()).into(BillingDetailsHomePage.CITY));
        actor.attemptsTo(Enter.theValue(data.getCountry()).into(BillingDetailsHomePage.COUNTRY));




    }

    public static BillingDetails info(Data data) {
        return instrumented(BillingDetails.class);
    }
}
