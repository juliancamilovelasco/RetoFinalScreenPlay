package com.practice.automationtesting.automation.stepdefinitions;

import com.practice.automationtesting.automation.models.Data;
import com.practice.automationtesting.automation.questions.IsNotRegistered;
import com.practice.automationtesting.automation.questions.ThankYou;
import com.practice.automationtesting.automation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

public class BuyBookStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor julian = Actor.named("julian");

    @Before
    public void setUp() {
        julian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that Julian want to buy a book (.*)$")
    public void thatJulianWantToBuyABook(String value) {
        julian.wasAbleTo(OpenTheBrowser.on());
        julian.wasAbleTo(SelectBookToBuy.selectBookToBuy());
        julian.wasAbleTo(SelectTwoBooks.selectTwoBooks());
        julian.wasAbleTo(ProceedToCheckout.proceedToCheckout(value));
    }

    @When("^he selects two books$")
    public void heSelectsTwoBooks(List<Data> dataList) {
        julian.attemptsTo(new BillingDetails(dataList.get(0)));
        julian.attemptsTo(PaymentMethod.payment());
    }

    @Then("^He should see (.*)$")
    public void heShouldSee(String message) {
        julian.should(seeThat(ThankYou.thankYouMessage(message)));
    }

//Caso no valido

    @Given("^that Julian enters to my account$")
    public void julianEntersToMyAccount(){
        julian.wasAbleTo(OpenTheBrowser.on());
        julian.attemptsTo(ClickMy.account());
    }

    @When("^he wants to login (.*) (.*)$")
    public void heWantsToLogin(String user, String password) {
        julian.attemptsTo(Login.onThePage(user, password));
    }

    @Then("^verify that he is not registered yet (.*)$")
    public void verifyThatHeIsNotRegisteredYet(String error) {
        julian.should(seeThat(IsNotRegistered.onThePage(error)));
    }


}








//mirar las interacciones
//mirar la question
//es bueno en vez de hacer una interacción, hacer otra task?
//Pueden Haber más HomePage que Tasks?
//el PageObjects de las Tasks

//julian.wasAbleTo(VerifyOrderQuantityBooks.value(value));