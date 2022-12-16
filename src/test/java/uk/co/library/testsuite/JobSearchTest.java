package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "dataset", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        Thread.sleep(1000);
        //Switching to frame
        driver.switchTo().frame(4);
        //CLicking on "Accept All" button
        homePage.clickOnAcceptAll();
        //Switching back to main window
        driver.switchTo().defaultContent();
        //Entering job title
        homePage.enterJobTitle(jobTitle);
        //Entering location
        homePage.enterLocation(location);
        //Selecting distance
        homePage.selectDistance(distance);
        //Click on More Search Option link
        homePage.clickOnMoreSearchOptionLink();
        Thread.sleep(1000);
        //Entering minimum salary
        homePage.enterMinSalary(salaryMin);
        //Entering Maximum salary
        homePage.enterMaxSalary(salaryMax);
        //Entering salary type
        homePage.selectSalaryType(salaryType);
        //Entering job type
        homePage.selectJobType(jobType);
        //Click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //Verifying the result
        resultPage.verifyTheResults(result);
    }
}
