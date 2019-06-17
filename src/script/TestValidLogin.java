package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin extends BaseTest {
	
	@Test
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String un = XL.getData(XL_PATH, "sheet1", 1, 0);
		String pw = XL.getData(XL_PATH, "sheet1", 1, 1);
		System.out.println(un+pw);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pw);	
		lp.clickLogin();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.verifyHomrPageIsDisplayed(driver, ETO);
		
		
	}

}
