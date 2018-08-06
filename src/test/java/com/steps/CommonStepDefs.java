package com.steps;

import Functions.Functions;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefs extends Functions{

    @Before
    public final void init() {
        initialize();
    }

    @When("^I am on page \"([^\"]*)\"$")
    public void iAmOnPage(String page) throws Throwable {
        onPage(page);
    }

    @Given("^I open main page$")
    public void iOpenMainPage() throws Throwable {
        openURL();
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void iClickOn(String element) throws Throwable {
        clickElement(element);
    }

    @And("^I close browser$")
    public void iCloseBrowser() throws Throwable {
        closeBrowser();
    }

    @And("^I enter \"([^\"]*)\" to a field \"([^\"]*)\"$")
    public void iEnterToAField(String value, String element) throws Throwable {
        enterValueToAField(element, value);
    }

    @And("^I select \"([^\"]*)\" from dropdown \"([^\"]*)\"$")
    public void iSelectFromDropdown(String value, String element) throws Throwable {
        selectFromDropDown(element, value);
    }

    @Then("^I verify element \"([^\"]*)\" has text \"([^\"]*)\"$")
    public void iVerifyElementHasText(String element, String value) throws Throwable {
        verifyText(element, value);
    }
}
