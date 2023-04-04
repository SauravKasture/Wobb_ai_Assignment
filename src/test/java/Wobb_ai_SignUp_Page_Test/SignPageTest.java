package Wobb_ai_SignUp_Page_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import static LibraryFiles.UtilityClass.getExcelData;
import Wobb_ai_SignUP_Module_Page.Wobb_ai_Sign_Up_Page;

public class SignPageTest extends BaseClass
{
	String TestCaseId;
	Wobb_ai_Sign_Up_Page sign;
	
	
	@BeforeClass
	public void openApplication() throws IOException
	{
		openBrowser();
		
		sign= new Wobb_ai_Sign_Up_Page(driver);
		
		
		
	}

	
	
	@Test
	public void Verification_of_Sign_Up_Functionality_by_using_all_valid_data() throws EncryptedDocumentException, IOException
	{
		TestCaseId="WI-TC01";
		sign.click_on_Sign_up_page_button();
		sign.inp_Enter_Email_into_TextBox(UtilityClass.getExcelData("verification of signUp page ", 6, 6));
		sign.inp_enter_Number_into_textbox(getExcelData("verification of signUp page ", 7, 6));
		sign.inp_enter_Password_into_create_Password_text_box(getExcelData("verification of signUp page ", 8, 6));
		sign.inp_enter_Name_into_Your_name_textbox(getExcelData("verification of signUp page ", 9, 6));
		sign.click_on_SelectRole_list_box();
		sign.selectRole_from_SelectRole_List_box(driver, getExcelData("verification of signUp page ", 10, 6));
		sign.inp_Enter_Brand_Name_into_BrandName_TextBox(getExcelData("verification of signUp page ", 11, 6));
		sign.inp_Enter_Brand_WebSite_into_BrandWebSite_TextBox(getExcelData("verification of signUp page ", 12, 6));
		sign.click_on_Agree_and_join_button();
	}
	
	@AfterClass
	public void closeApp()
	{
		closeBroswer();
	}
}
