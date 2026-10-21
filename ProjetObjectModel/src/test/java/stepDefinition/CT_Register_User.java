package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Page_Home_Product_Object;
import pageObject.Page_Signup_Login_Object;

public class CT_Register_User {
	
	WebDriver driver = SetUp.driver;
	
	Page_Home_Product_Object Home = new Page_Home_Product_Object (driver);
	Page_Signup_Login_Object Signup = new Page_Signup_Login_Object(driver);
	
	
	@Given("Navigate to url {string}")
	public void navigate_to_url(String string) {
	  Home.acces_URL(string);
	}

	@Then("Verify that home page name {string} is visible successfully")
	public void verify_that_home_page_name_is_visible_successfully(String string) {

	    Assert.assertTrue(Home.txt_home.isDisplayed());
	}

	@When("Click on Signup \\/ Login button")
	public void click_on_signup_login_button() {
	
		Home.click_signup();
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
		Assert.assertEquals(string, Signup.Verify_txt());
	}

	@When("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String string, String string2) {
	 Signup.insert_name(string);
	 Signup.insert_mail(string2);
	}

	@When("Click Signup button")
	public void click_signup_button() {
	 Signup.click_Button_signup();
	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String string) {
		Assert.assertTrue(Signup.Txt_create_account.isDisplayed());
	}

	@When("Fill details: Title {string} , Name {string} , Email {string} , Password {string}")
	public void fill_details_title_name_email_password(String string, String string2, String string3, String string4) {
	
		Signup.Remplir_formulaire_part1(string , string4);
	
	 Assert.assertEquals(Signup.recuprer_texte_deja_remplis(), string2);
	  Assert.assertEquals(Signup.recuprer_mail_deja_remplis(), string3);
	}

	@When("Date of birth {string} , {string} , {string}")
	public void date_of_birth(String string, String string2, String string3) {
	   
	}

	@When("Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!")
	public void select_checkbox_sign_up_for_our_newsletter_and_select_checkbox_receive_special_offers_from_our_partners() {
	    
	}

	@When("Fill details: First name {string} , Last name {string} , Company {string} , Address {string} , Address2 {string}")
	public void fill_details_first_name_last_name_company_address_address2(String string, String string2, String string3, String string4, String string5) {
	    
	}

	@When("Fill details: Country {string} , State {string} , City {string} , Zipcode {string} , Mobile Number {string}")
	public void fill_details_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5) {
	   
	}

	@When("Click Create Account button")
	public void click_create_account_button() {
	   
	}

	@When("Click Continue button")
	public void click_continue_button() {
	   
	}

	@When("Click Delete Account button")
	public void click_delete_account_button() {
	    
	}

	
}
