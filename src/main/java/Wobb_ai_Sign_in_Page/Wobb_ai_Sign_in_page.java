package Wobb_ai_Sign_in_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class Wobb_ai_Sign_in_page 
{
	@FindBy(xpath = "//a[text()='Log In']") private WebElement logIn;
	@FindBy(xpath = "//input[@placeholder='john@example.com']") private WebElement phone_or_email;
	@FindBy(xpath = "//button[text()='Next']") private WebElement nextbutton;
	@FindBy(xpath = "//input[@name='password']") private WebElement enterpassword;
	@FindBy(xpath = "//button[@type='submit']") private WebElement signInbutton;
	@FindBy(xpath = "//div[@class='_titleWrapper_rhz5a_139']") private WebElement profile;

	@FindBy(xpath = "//span[text()='Logout from all device']") private WebElement logout_from_all_devices;
	
	@FindBy(xpath = "//span[text()='Sign Out']") private WebElement logout;
	public Wobb_ai_Sign_in_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void click_on_Log_InButton()
	{
		logIn.click();
	}
	
	public void inp_Enter_number_or_email_into_text_box(String number) 
	{
		phone_or_email.sendKeys(number);
		
	}
	
	
	public void click_on_Next_button()
	{
		nextbutton.click();
	}
	
	public void inp_enter_password_into_password_text_box(String password) 
	{
		enterpassword.sendKeys(password);
		
	}
	
	public void click_on_sign_In_button()
	{
		signInbutton.click();
	}
	
	
	public void click_on_profile(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, profile);
	}
	
	
	public void click_on_logout_button()
	{
		logout.click();
	}
	
	public void click_on_logout_from_all_devices_button()
	{
		logout_from_all_devices.click();
	}
}
