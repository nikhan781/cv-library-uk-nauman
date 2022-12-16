package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    //Declaring WebElements Variable
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    //This method will verify the result text
    public void verifyTheResults(String expected) {
        Reporter.log("Verify Result " + resultText.toString());
        Assert.assertEquals(getTextFromElement(resultText), expected);
        CustomListeners.test.log(Status.PASS, "The result is " + "Expected Text is " + "\" " + expected + "\"" + " And Actual Text is " + "\" " + resultText.getText() + "\"");
    }

}
