package com.practice.automationtesting.automation.tasks;


import com.practice.automationtesting.automation.interactions.Call;
import com.practice.automationtesting.automation.questions.VerifyOrderQuantityBooks;
import com.practice.automationtesting.automation.userInterfaces.AndroidQuickStartGuideHomePage;
import com.practice.automationtesting.automation.userInterfaces.ProceedToCheckoutHomePage;
import com.practice.automationtesting.automation.userInterfaces.VerifyOrderHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProceedToCheckout implements Task {

    String value;

    public ProceedToCheckout(String value) {
        this.value = value;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Valor de la página: " + VerifyOrderHomePage.VERIFY_SELECT_TWO_BOOKS.resolveFor(actor).getText());
        actor.attemptsTo(Call.question(value));
        actor.attemptsTo(Click.on(ProceedToCheckoutHomePage.PROCEED_TO_CHECKOUT));
    }

    public static ProceedToCheckout proceedToCheckout(String value) {
        return instrumented(ProceedToCheckout.class,value);
    }
}
