package StepDefinitions;

import PageObjectModels.Locators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.LocalDate;

public class US_004_HamburgerMenu_MessagingSteps {
    Locators locators = new Locators();
    Actions actions = new Actions(DriverManager.Driver());
    @Given("The user navigates to website")
    public void theUserNavigatesToWebsite() {
        DriverManager.Driver().get("https://test.mersys.io/");
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        locators.usernameBox.sendKeys("Student_3");
        locators.passwordBox.sendKeys("S12345");
        locators.loginButton.click();
    }

    @When("Clicks the hamburger button")
    public void clicksTheHamburgerButton() {
        locators.hamburgerButton.click();
    }

    @And("Hover over messaging feature")
    public void hoverOverMessagingFeature() {
        actions.moveToElement(locators.messagingButton).build().perform();
    }

    @And("Verify that new message,inbox,outbox and trash are visible")
    public void verifyThatNewMessageInboxOutboxAndTrashAreVisible() {
        for (int i = 5; i <locators.messagingList.size() ; i++) {
            if(locators.messagingList.get(i).getText().equals("New Message")){
                System.out.println(locators.messagingList.get(i).getText());
            } else if (locators.messagingList.get(i).getText().equals("Inbox")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else if (locators.messagingList.get(i).getText().equals("Outbox")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else if(locators.messagingList.get(i).getText().equals("Trash")){
                System.out.println(locators.messagingList.get(i).getText());
            }

        }



    }

    @And("Click the new message feature")
    public void clickTheNewMessageFeature() {
    }

    @Then("Verify that current url contains word of new")
    public void verifyThatCurrentUrlContainsWordOfNew() {
    }

    @And("Click the inbox feature")
    public void clickTheInboxFeature() {
    }

    @Then("Verify that current url contains word of inbox")
    public void verifyThatCurrentUrlContainsWordOfInbox() {
    }

    @And("Click the outbox feature")
    public void clickTheOutboxFeature() {
    }

    @Then("Verify that current url contains word of outbox")
    public void verifyThatCurrentUrlContainsWordOfOutbox() {
    }

    @And("Click the trash feature")
    public void clickTheTrashFeature() {
    }

    @Then("Verify that current url contains word of trash")
    public void verifyThatCurrentUrlContainsWordOfTrash() {
    }
}
