package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Signup_Login_Object {

	
	public WebDriver driver;	
	
	public Page_Signup_Login_Object (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using ="//h2[normalize-space()='New User Signup!']") 
	WebElement Txt_User_signup;
	
	
	@FindBy (how = How.XPATH, using ="//input[@placeholder='Name']")
	WebElement Txt_name;
	
	@FindBy (how = How.XPATH, using ="//input[@data-qa='signup-email']")
	WebElement Txt_email_address;
	
	@FindBy (how = How.XPATH, using = "//button[normalize-space()='Signup']")
	WebElement Signup_BT;
	
	@FindBy (how =How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	public WebElement Txt_create_account;
	
	@FindBy (how = How.XPATH, using ="//input[@value='Mr']")
	WebElement Bt_title;
	
	@FindBy (how = How.XPATH, using = "//input[@value='Mrs']")
	WebElement Bt_title_mme;
	
    @FindBy (how = How.XPATH, using = "//input[@type='password']")
    WebElement Txt_Password;
		  
    @FindBy (how = How.XPATH, using = "//input[@id='name']")
    WebElement Txt_name_page;
    
    @FindBy (how = How.XPATH, using = "//input[@id='email']")
	  WebElement Txt_mail_page;
	
    
	public String Verify_txt () {
		String Nom_Affiche = Txt_User_signup.getText();
		return Nom_Affiche;
	}
	
	public void insert_name (String Txt_name_inserer ) {
		Txt_name.sendKeys(Txt_name_inserer);
	}
	public void insert_mail (String Txt_email_inserer ) {
		Txt_email_address.sendKeys(Txt_email_inserer);
	}
	
	public void click_Button_signup () {
		Signup_BT.sendKeys();
	}
	
	public void Remplir_formulaire_part1 ( String Sexe , String Password) {
	
		if (Bt_title.equals("Mr")) {
	
			  Bt_title.click();
				}
				else {
					 WebElement Bt_title_mme = driver.findElement(By.xpath("//input[@value='Mrs']"));
					 Bt_title_mme.click();
				}
		Txt_Password.sendKeys(Password);
	}
	
	public String recuprer_texte_deja_remplis () {
		String Txt_name_page_existe = Txt_name_page.getAttribute("value");
		return Txt_name_page_existe;
		 
	}
	public String recuprer_mail_deja_remplis () {
		 String Txt_mail_page_existe = Txt_mail_page.getAttribute("value");
		  return Txt_mail_page_existe;
		 
	}
	
	
	}

