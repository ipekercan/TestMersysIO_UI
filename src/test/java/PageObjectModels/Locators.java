package PageObjectModels;

import Utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Locators extends Methods {
    public Locators() {
        PageFactory.initElements(DriverManager.Driver(), this);
    }
    @FindBy(xpath="//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger']//*[name()='svg']")
    public WebElement hamburgerButton;
    @FindBy(xpath="//span[contains(text(),'Messaging')]")
    public WebElement messagingButton;
    @FindBy(xpath="//span[@class='mat-mdc-menu-item-text']")
    public List<WebElement> messagingList;
    @FindBy(xpath="//span[contains(text(),'New Message')]")
    public WebElement newMessage;
    @FindBy(xpath="//span[contains(text(),'Inbox')]")
    public WebElement inbox;
    @FindBy(xpath="(//span[contains(text(),'Outbox')])[2]")
    public WebElement outbox;
    @FindBy(xpath="(//span[contains(text(),'Trash')])[2]")
    public WebElement trash;


    @FindBy(css="input[formcontrolname='username']")
    public WebElement usernameBox;
    @FindBy(css="input[formcontrolname='password']")
    public WebElement passwordBox;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;
/*    @FindBy(xpath="//span[contains(text(),'Inbox')]")
    public WebElement inbox;
    @FindBy(xpath="(//span[contains(text(),'Outbox')])[2]")
    public WebElement outbox;
    @FindBy(xpath="(//span[contains(text(),'Trash')])[2]")
    public WebElement trash;*/
}
