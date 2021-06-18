package com.practice.automationtesting.automation.tasks;

import com.practice.automationtesting.automation.userInterfaces.MyAccountHomePage;
import com.practice.automationtesting.automation.userInterfaces.PracticeShopHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    String user, password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(user).into(MyAccountHomePage.USER));
        actor.attemptsTo(Enter.theValue(password).into(MyAccountHomePage.PASSWORD));
        actor.attemptsTo(Click.on(MyAccountHomePage.BUTTON_LOGIN));

    }

    public static Login onThePage(String user, String password) {
        return instrumented(Login.class, user, password);
    }
}
