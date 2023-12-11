package PageObjectModels;

import Utilities.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Methods {
    public Locators() {
        PageFactory.initElements(DriverManager.get(), this);
    }


}
