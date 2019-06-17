package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void verifyHomrPageIsDisplayed(WebDriver driver, long ETO)
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		try
		{
			wait.until(ExpectedConditions.titleContains("Enter"));
			Reporter.log("Home page is displaed", true);
		}
		
		catch(Exception e)
		{
		Reporter.log("Home page is not displayed", true);	
		}
		
		
	}

}
