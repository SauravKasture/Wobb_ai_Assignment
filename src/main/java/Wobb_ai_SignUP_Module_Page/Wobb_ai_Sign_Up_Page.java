package Wobb_ai_SignUP_Module_Page;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wobb_ai_Sign_Up_Page
{





@FindBy(xpath = "//input[@placeholder='john@example.com']") private WebElement emailId_phonetextbox;
@FindBy(xpath = "(//input[@placeholder='Enter Number'])[1]") private WebElement number;
@FindBy(xpath = "//input[@placeholder='(Must be at least 8 characters)']") private WebElement password;
@FindBy(xpath = "//input[@placeholder='John']")  private WebElement enterName;
@FindBy(xpath = "(//div[@class='_inputRow_1f8je_13'])[5]")private WebElement selectRole;
@FindBy(xpath = "//div[@tabindex='-1']/ul/li") private WebElement selectBrand;
@FindBy(xpath = "//input[@name='brandName']") private WebElement BrandName;
@FindBy(xpath = "//input[@name='brandWebsite']") private WebElement BrandWebSite;
@FindBy(xpath = "//button[@type='submit']")private WebElement Agree_And_Join;
@FindBy(xpath = "//button[@class='web-signup']") private WebElement signUp;
public Wobb_ai_Sign_Up_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void click_on_Sign_up_page_button()
{
	signUp.click();
}

public void inp_Enter_Email_into_TextBox(String email)
{
	emailId_phonetextbox.sendKeys(email);
}

public void inp_enter_Number_into_textbox(String Number)
{
	number.sendKeys(Number);
	
}

public void inp_enter_Password_into_create_Password_text_box(String Password)
{
	password.sendKeys(Password);
}

public void inp_enter_Name_into_Your_name_textbox(String name) 
{
	enterName.sendKeys(name);
}

public void click_on_SelectRole_list_box()
{
	selectRole.click();
}

public void selectRole_from_SelectRole_List_box(WebDriver driver, String Role) {
	List<WebElement> roles = driver.findElements(By.xpath("//div[@tabindex='-1']/ul/li"));

	for(WebElement role:roles)
	{
		if(role.getText().equals(Role))
		{
			role.click();
			break;
		}
	}
}

public void inp_Enter_Brand_Name_into_BrandName_TextBox(String Brandname)
{
	BrandName.sendKeys(Brandname);
}

public void inp_Enter_Brand_WebSite_into_BrandWebSite_TextBox(String BrandWebsite)
{
	BrandWebSite.sendKeys(BrandWebsite);
}
public void click_on_Agree_and_join_button()
{
	Agree_And_Join.click();
}
}
