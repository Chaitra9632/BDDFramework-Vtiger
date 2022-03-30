package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	//1. identify the element using @FindBy, @FindBys, @FindAll
	//2. declare the web Element reference as private
	
	@FindBy(name = "user_name") private WebElement userNameEdt;
	@FindBy(name = "user_password") private WebElement passwordEdt;
	@FindBy(id = "submitButton") private WebElement submitBtn;
	
	//5. Create a constructor to initializing all the webElements using pageFactory.initelements
	
//		public LoginPage(WebDriver driver)
//		{
//			PageFactory.initElements(driver, this);
//		}
	
	//3. provide getter method for private web elements
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	//4. Provide business Logic
	
	public void loginToApp(String username, String password)
	{
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		
	}
	
	public void clickOnLoginButton()
	{
		submitBtn.click();
	}
	
	
	
}
