package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Step 1: Declaration
		@FindBy(linkText = "Organizations")
		private WebElement organizationLnk;
		
		@FindBy(linkText = "Contacts")
		private WebElement contactsLnk;
		
		@FindBy(linkText = "Opportunities")
		private WebElement opportunitiesLnk;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement adminisrtatorImg;
		
		@FindBy(linkText = "Sign Out")
		private WebElement signOutLnk;
		
	//Step 2: Initialise
		
//		public HomePage(WebDriver driver)
//		{
//			PageFactory.initElements(driver, this);
//		}

	//Step 3: Utilisation
		public WebElement getOrganizationLnk() {
			return organizationLnk;
		}

		public WebElement getContactsLnk() {
			return contactsLnk;
		}

		public WebElement getOpportunitiesLnk() {
			return opportunitiesLnk;
		}

		public WebElement getAdminisrtatorImg() {
			return adminisrtatorImg;
		}

		public WebElement getSignOutLnk() {
			return signOutLnk;
		}
		
	//Buisness logic
		
		public void clickOnOrgLink()
		{
			organizationLnk.click();
		}
		
		public void signOut()
		{
			
		}
		

		
		

}
