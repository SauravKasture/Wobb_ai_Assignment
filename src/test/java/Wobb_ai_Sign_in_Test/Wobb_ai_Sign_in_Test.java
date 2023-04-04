package Wobb_ai_Sign_in_Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Wobb_ai_Sign_in_Page.Wobb_ai_Sign_in_page;

public class Wobb_ai_Sign_in_Test extends BaseClass
{
	String TestCaseId;
	Wobb_ai_Sign_in_page login;
	
	
	@BeforeClass
	public void openApplication() throws IOException
	{
		openBrowser();
		
		login= new Wobb_ai_Sign_in_page(driver);
	}

	
	@Test
	public void loginToApplication() throws IOException, InterruptedException
	{
		login.click_on_Log_InButton();
		login.inp_Enter_number_or_email_into_text_box(UtilityClass.getPropertyFileData("username"));
		login.click_on_Next_button();
		login.inp_enter_password_into_password_text_box(UtilityClass.getPropertyFileData("password"));
		login.click_on_sign_In_button();
		login.click_on_profile(driver);
		Thread.sleep(2000);
		login.click_on_logout_button();
		Thread.sleep(2000);
		login.click_on_logout_from_all_devices_button();
	}
}
