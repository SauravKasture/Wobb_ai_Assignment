package Wobb_ai_Post_Campaign_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static LibraryFiles.UtilityClass.getExcelData;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Wobb_ai_Home_Page.Wobb_ai_Home_Page;
import Wobb_ai_Post_Campaign_Page.Wobb_ai_Post_Campaign_Page;
import Wobb_ai_Sign_in_Page.Wobb_ai_Sign_in_page;

public class Wobb_ai_Post_Campaign_Test extends BaseClass
{
	
	String TestCaseID;
	Wobb_ai_Home_Page home;
	Wobb_ai_Sign_in_page sgin;
	Wobb_ai_Post_Campaign_Page pcp;
	SoftAssert sft;
	
	@BeforeClass 
	public void openApplication() throws IOException
	{
		openBrowser();
		
		home= new Wobb_ai_Home_Page(driver);
		sgin= new Wobb_ai_Sign_in_page(driver);
		sft= new SoftAssert();
		pcp= new Wobb_ai_Post_Campaign_Page(driver);
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
	public void Verification_of_Post_Campaign_Feature () throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		
		home.click_on_Post_Campaigns_button();
		
		pcp.inp_Enter_Campaign_name_into_text_box( UtilityClass.getExcelData("Verification of Post Campaign", 11, 6));
		pcp.click_on_Platform_Listbox();
		pcp.select_Platform(driver, getExcelData("Verification of Post Campaign", 13, 6));
		pcp.click_on_Select_deliverables_listbox();
		Thread.sleep(500);
		pcp.click_on_dedicatedvideobutton(driver);
		Thread.sleep(500);
		pcp.click_on_dropArrow_button_platform(driver);
		Thread.sleep(500);
		pcp.click_on_Select_categories_list_box();
		Thread.sleep(500);
		pcp.click_on_comedy_option(driver);;
		Thread.sleep(500);
		pcp.click_on_Stand_up_Comedians_radio_button(driver);
		Thread.sleep(500);
		pcp.click_on_sketch_comedy_radio_button(driver);
		Thread.sleep(500);
		pcp.click_on_Select_categories_list_box_out(driver);
		Thread.sleep(500);
		pcp.click_on_Select_followers_range_listbox();
		Thread.sleep(500);
		pcp.click_on_Nano_1K_10K_option(driver);
		pcp.click_on_Select_categories_list_box_out(driver);
		pcp.inp_Enter_number_into_influencer_required_text_box(getExcelData("Verification of Post Campaign", 22, 6));
		pcp.click_on_Save_Influencer_Requiremen_section();
		Thread.sleep(500);
		pcp.click_on_tost_pop_up();
		pcp.click_On_Promotional_Goals_listbox();
		pcp.click_on_Product_Unboxing_Radio_button(driver);
		pcp.inp_Enter_input_into_description(getExcelData("Verification of Post Campaign", 26, 6));
		pcp.click_on_save_Button_of_Campaign_Requirement_section();
		pcp.click_on_tost_pop_up_Campaign_Requirement_section();
		pcp.click_on_Performance_Based_Checkbox();
		Thread.sleep(500);
		pcp.inp_enter_comissionRate_payout_into_text_box(getExcelData("Verification of Post Campaign",29, 6));
		pcp.click_on_payout_per_listbox();
		pcp.select_select_payout_per_option(driver, getExcelData("Verification of Post Campaign", 31, 6));
		pcp.inp_Enter_Milestone_into_text_box(getExcelData("Verification of Post Campaign", 32, 6));
		pcp.click_on_Time_to_deliver_drop_down();
		pcp.seletc_Time_to_deliver_option(driver, getExcelData("Verification of Post Campaign", 34, 6));
		pcp.click_on_Post_Campaign_button();
		
	
	}
	
}
