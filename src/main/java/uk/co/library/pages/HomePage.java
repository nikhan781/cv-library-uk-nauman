package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    //Declaring WebElements Variable
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "(//select[@name='distance'])[2]")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
    WebElement acceptAll;

    //This method will send text to WebElement
    public void enterJobTitle(String jobtitle) {
        Reporter.log("Enter job title " + jobtitle + "in Job Title field" + jobTitleFiled.toString());
        sendTextToElement(jobTitleFiled, jobtitle);
        CustomListeners.test.log(Status.PASS, "Entered job title is  " + jobtitle);
    }

    //This method will send text to WebElement
    public void enterLocation(String location) {
        Reporter.log("Enter Location " + location + "in Location field" + locationField.toString());
        sendTextToElement(locationField, location);
        CustomListeners.test.log(Status.PASS, "Entered Location is  " + location);
    }

    //This method will select a WebElement
    public void selectDistance(String distance) {
        Reporter.log("Select Distance " + distance + "in Salary Type field" + salaryMin.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "Selected distance is " + distance);
    }

    //This method will send text to WebElement
    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter minimum salary " + minSalary + "in Salary Min field" + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Minimum salary is " + minSalary);
    }

    //This method will send text to WebElement
    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter maximum salary " + maxSalary + "in Salary Max field" + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Minimum salary is " + maxSalary);
    }

    //This method will select a WebElement
    public void selectSalaryType(String sType) {
        Reporter.log("Select salary Type " + sType + "in Salary Type field" + salaryMin.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        CustomListeners.test.log(Status.PASS, "Salary Type is " + sType);
    }

    //This method will select a WebElement
    public void selectJobType(String jobType) {
        Reporter.log("Select job Type " + jobType + "in Job Type field" + salaryMin.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "Salary Type is " + jobType);
    }

    //This method will click on WebElement
    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on More Search Option Link " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on More Search Option Link ");
    }

    //This method will click on WebElement
    public void clickOnFindJobsButton() {
        Reporter.log("Click on Find Job Button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "Click on Find Job Button ");
    }

    public void clickOnAcceptAll() throws InterruptedException {
        Reporter.log("Click on Accept All Button " + acceptAll.toString());
        clickOnElement(acceptAll);
        CustomListeners.test.log(Status.PASS, "Click on Accept All Button ");
    }

}
