package Wobb_ai_Post_Campaign_Page;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class Wobb_ai_Post_Campaign_Page
{
	@FindBy(xpath = "//input[@id='campaign-name']") private WebElement campaignname;
	
	@FindBy(xpath = "//div[@id='mui-component-select-Platform'] ") private WebElement platform;
	@FindBy(xpath = "//div[@tabindex='-1']/ul/li") private WebElement SelectPlatform;
	@FindBy(xpath = "//p[text()='Select deliverables']") private WebElement deliverables;
	@FindBy(xpath = "(//div[@class='MuiBox-root jss61']/ul/div//button)[2]") private WebElement deliverableslist;
	@FindBy(xpath = "(//span[@class='MuiIconButton-label']) [6]") private WebElement dedicatedVideo;
	@FindBy(xpath = "(//button[@tabindex='0'])[2]") private WebElement dropArrowplatform;
	@FindBy(xpath = "(//button[@tabindex='0'])[3]") private WebElement Select_categories;
	@FindBy(xpath = "//span[text()='Comedy']") private WebElement comedy;
	@FindBy(xpath = "//span[text()='Stand-up Comedians']") private WebElement Stand_up_Comedians;
	@FindBy(xpath = "//span[text()='Sketch Comedy']") private WebElement Sketch_Comedy;
	@FindBy(xpath = "//p[text()='Select followers range']") private WebElement Select_followers_range;
	@FindBy(xpath = "//span[text()='Nano (1K-10K)']") private WebElement Nano_1K_10K;
	@FindBy(xpath = "//input[@id='influencer-required']") private WebElement influencer_required;
	@FindBy(xpath = "//button[text()='Save']") private WebElement Save_Influencer_Requiremen;
	@FindBy(xpath = "//p[text()='Promotional Goals']") private WebElement Promotional_Goals;
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success']") private WebElement tostPopup;
	@FindBy(xpath = "//span[text()='Product Unboxing']") private WebElement Product_Unboxing;
	@FindBy(xpath = "//textarea") private WebElement description;
	@FindBy(xpath = "//button[text()='Save']") private WebElement save_Campaign_Requirement;
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success']") private WebElement tost_pop_up_Campaign_Requirement_section;
	@FindBy(xpath = "//span[text()='Performance Based']") private WebElement Performance_Based;
	@FindBy(xpath = "(//input[@name='comissionRate'])[2]") private WebElement comissionRate;
	@FindBy(xpath = "(//div[@id='mui-component-select-comissionRate'])[2]") private WebElement payout_per_listbox;
	@FindBy(xpath = "//div/ul/li") private WebElement select_payout_per;
	@FindBy(xpath = "//input[@placeholder='Milestone']") private WebElement Milestone;
	@FindBy(xpath = "(//div[@role='button'])[3]") private WebElement Time_to_deliver_drop_down;
	@FindBy(xpath = "//div/ul/li") private WebElement seletc_Time_to_deliver_option;
	@FindBy(xpath = "(//span[text()='Post Campaign'])[2]") private WebElement Post_Campaign;
	public Wobb_ai_Post_Campaign_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void inp_Enter_Campaign_name_into_text_box (String name)
	{
		campaignname.sendKeys(name);
	}
	
	public void click_on_Platform_Listbox()
	{
		platform.click();
	}
	
	

	public void select_Platform(WebDriver driver, String p) throws EncryptedDocumentException, IOException
	{
		List<WebElement> platforms = driver.findElements(By.xpath("//div[@tabindex='-1']/ul/li"));
		
		
		for(WebElement platForm: platforms)
		{
			if(platForm.getText().equals(p))
			{
				platForm.click();
				break;
			}
		}
		
	
	}
	
	public void click_on_Select_deliverables_listbox()
	{
		deliverables.click();

	}
	
	public void click_on_dedicatedvideobutton(WebDriver driver)
	{
		
		
		UtilityClass.getHandelDropDown(driver, dedicatedVideo);
		 
	}
	
	public void click_on_dropArrow_button_platform(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, dropArrowplatform);
	}
	
	public void click_on_Select_categories_list_box()
	{
		Select_categories.click();
		
	}
	
	public void click_on_comedy_option(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, comedy);
	}
	public boolean click_on_Stand_up_Comedians_radio_button(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, Stand_up_Comedians);
		return Stand_up_Comedians.isSelected();
		
	}
	
	public boolean click_on_sketch_comedy_radio_button(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, Sketch_Comedy);
		return Sketch_Comedy.isSelected();
	}
	public void click_on_Select_categories_list_box_out(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, Select_categories);
		
	}
	
	public void click_on_Select_followers_range_listbox()
	{
		Select_followers_range.click();
	}
	
	public void click_on_Nano_1K_10K_option(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, Nano_1K_10K);
	}
	
	public void inp_Enter_number_into_influencer_required_text_box(String number)
	{
		influencer_required.sendKeys(number);
	}
	
	public void click_on_Save_Influencer_Requiremen_section()
	{
		Save_Influencer_Requiremen.click();
	}
	
	public void click_on_tost_pop_up()
	{
		tostPopup.click();
	}
	
	public void click_On_Promotional_Goals_listbox()
	{
		Promotional_Goals.click();;
	}
	
	public void click_on_Product_Unboxing_Radio_button(WebDriver driver)
	{
		UtilityClass.getHandelDropDown(driver, Product_Unboxing);
	}
	public void inp_Enter_input_into_description(String text)
	{
		description.sendKeys(text);
	}
	public void click_on_save_Button_of_Campaign_Requirement_section()
	{
		save_Campaign_Requirement.click();
	}
	
	
	public void click_on_tost_pop_up_Campaign_Requirement_section()
	{
		tost_pop_up_Campaign_Requirement_section.click();
	}
	public void click_on_Performance_Based_Checkbox()
	{
		Performance_Based.click();
	}
	
	public void inp_enter_comissionRate_payout_into_text_box(String money)
	{
		comissionRate.sendKeys(money);
	}
	
	public void click_on_payout_per_listbox()
	{
		payout_per_listbox.click();
	}
	
	public void select_select_payout_per_option(WebDriver driver,String op)
	{
		List<WebElement> list = driver.findElements( By.xpath("//div/ul/li"));
		for(WebElement option:list)
		{
			if(option.getText().equals(op))
			{
				option.click();
				break;
			}
		}
	}
	
	public void inp_Enter_Milestone_into_text_box(String milestone)
	{
		Milestone.sendKeys(milestone);
	}
	
	public void click_on_Time_to_deliver_drop_down()
	{
		Time_to_deliver_drop_down.click();
	}
	
	public void seletc_Time_to_deliver_option(WebDriver driver,String op)
	{
		List<WebElement> list = driver.findElements(By.xpath("//div/ul/li"));
		for(WebElement option: list)
		{
			if(option.getText().equals(op))
			{
				option.click();
				break;
			}
		}
	
	}
	
	public void click_on_Post_Campaign_button()
	{
		Post_Campaign.click();
	}
}
