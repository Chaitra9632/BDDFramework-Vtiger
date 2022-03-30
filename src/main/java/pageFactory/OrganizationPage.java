package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	//Step 1: declaration
		@FindBy(xpath = "//img[@alt='Create Organization...']")
		private WebElement createOrgLookUpImg;
		
		//Step 2: initialization
//		public OrganizationPage(WebDriver driver)
//		{
//			PageFactory.initElements(driver, this);
//		}
		
		//Step 3: Utilization
		
		public WebElement getCreateOrgLookUpImg() {
			return createOrgLookUpImg;
		}
		
		//Business Library
		public void clickOnCreateOrgImg()
		{
			createOrgLookUpImg.click();
		}
}
