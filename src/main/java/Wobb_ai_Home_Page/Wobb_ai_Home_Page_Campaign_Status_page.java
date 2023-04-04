package Wobb_ai_Home_Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wobb_ai_Home_Page_Campaign_Status_page
{
	@FindBy(xpath = "//span[text()='All']") private WebElement all;
	
	@FindBy(xpath = "//th[position()>=2 and position()<=4]") private WebElement tableheaders;
	@FindBy(xpath = "//tr[position()>1]//td[position()>=2 and position()<=4] ") private WebElement tableData;
	@FindBy(xpath = "(//button[@type='button'])[2]") private WebElement threedot;
	
	public Wobb_ai_Home_Page_Campaign_Status_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void click_on_all_button()
	{
		all.click();
	}

	
	public List<String> verifyTabelHeaders(WebDriver driver)
	{
		List<WebElement> headers = driver.findElements(By.xpath("//th[position()>=2 and position()<=4]"));
		List<String> headers_= new ArrayList<String>();
		
		for(WebElement headerm:headers )
		{
			headers_.add(headerm.getText());
		}
		
		
		return headers_;
	}
	
	public List<String>  verifyTableBody(WebDriver driver)
	{
		List<WebElement> trbodys = driver.findElements(By.xpath("//tr[position()>1]//td[position()>=2 and position()<=4]"));
		
		List<String> data= new ArrayList<String>();
		for(WebElement tr: trbodys)
		{
			data.add(tr.getText());
		}
		return data;
	}
	

	
	
}
