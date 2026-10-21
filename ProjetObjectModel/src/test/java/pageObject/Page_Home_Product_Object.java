package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Home_Product_Object {

	public  WebDriver driver;
	
	/* constructeur  */

	public Page_Home_Product_Object (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* identification */
	@FindBy ( how = How.XPATH, using = "//a[normalize-space()='Home']")
	public static WebElement txt_home;
	
	@FindBy (how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	WebElement Bt_signup;
	
	/* methode */
	public void acces_URL (String URL) {
		driver.get(URL);
	}
	
	public void click_signup () {
		Bt_signup.click();
	}
	
}
