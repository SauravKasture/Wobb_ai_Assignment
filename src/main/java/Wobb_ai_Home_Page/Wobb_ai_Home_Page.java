package Wobb_ai_Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wobb_ai_Home_Page
{
	@FindBy(xpath = "//span[text()='Dashboard']") private WebElement Dashboard;
	@FindBy(xpath = "//span[text()='Post Campaigns']") private WebElement Post_Campaigns;
	@FindBy(xpath = "//span[text()='Post Campaign']") private WebElement PostCampaignsButton;
	public Wobb_ai_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	public void click_on_Dashboard_button()
	{
		Dashboard.click();
	}
	
	public void click_on_Post_Campaigns_Tab()
	{
		Post_Campaigns.click();
	}

	public void click_on_Post_Campaigns_button()
	{
		PostCampaignsButton.click();
	}
	
}
