package Wobb_ai_Post_Campaign_Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Wobb_ai_Home_Page.Wobb_ai_Home_Page;
import Wobb_ai_Home_Page.Wobb_ai_Home_Page_Campaign_Status_page;
import Wobb_ai_Post_Campaign_Page.Wobb_ai_Post_Campaign_Page;
import Wobb_ai_Sign_in_Page.Wobb_ai_Sign_in_page;

public class Wobb_ai_Home_Page_Campaign_Status_Test extends BaseClass
{
	String TestCaseID;
	Wobb_ai_Home_Page home;
	Wobb_ai_Sign_in_page sgin;
	SoftAssert soft;
	
	Wobb_ai_Home_Page_Campaign_Status_page sts;
	
	@BeforeClass 
	public void openApplication() throws IOException
	{
		openBrowser();
		
		home= new Wobb_ai_Home_Page(driver);
		sgin= new Wobb_ai_Sign_in_page(driver);
		sts= new  Wobb_ai_Home_Page_Campaign_Status_page(driver);
		soft= new SoftAssert();
		log.info("**** open application *****");
	}
	
	@BeforeMethod
	public void sign_in_into_application() throws IOException
	{
		sgin.click_on_Log_InButton();
		sgin.inp_Enter_number_or_email_into_text_box(UtilityClass.getPropertyFileData("username"));
		sgin.click_on_Next_button();
		sgin.inp_enter_password_into_password_text_box(UtilityClass.getPropertyFileData("password"));
		sgin.click_on_sign_In_button();
	}
	
	@Test
	public void Verification_of_Campaign_Status_section_All_option_present_on_Dashboard ()
	{
		sts.click_on_all_button();
		
	}
	
	
	
	
	
}
