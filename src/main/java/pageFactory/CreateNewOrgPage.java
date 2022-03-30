package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WebDriverUtility;

public class CreateNewOrgPage extends WebDriverUtility {

	//Step 1: Declaration
		@FindBy(name = "accountname")
		private WebElement OrgNameEdt;
		
		@FindBy(name = "industry")
		private WebElement industryDropDown;
		
		@FindBy(name = "accounttype")
		private WebElement typeDropDown;
		
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;
		
	//Step 2: initialization
//		public CreateNewOrgPage(WebDriver driver)
//		{
//			PageFactory.initElements(driver, this);
//		}

	//Step 3: Utilization
		public WebElement getOrgNameEdt() {
			return OrgNameEdt;
		}

		public WebElement getIndustryDropDown() {
			return industryDropDown;
		}

		public WebElement getTypeDropDown() {
			return typeDropDown;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		//Business Library
		/**
		 * This method will create new organization
		 * @param orgName
		 */
		public void createNewOrg(String orgName)
		{
			OrgNameEdt.sendKeys(orgName);
			
		}
		
		public void saveOrg()
		{
			saveBtn.click();
		}
		/**
		 * this method will create new organization with industry drop down
		 * @param orgName
		 * @param indType
		 */
		public void createNewOrg(String orgName,String indType)
		{
			OrgNameEdt.sendKeys(orgName);
			select(indType, industryDropDown);
			saveBtn.click();
		}
		
		public void chooseIndustryType(String indType)
		{
			
			select(indType, industryDropDown);
			saveBtn.click();
		}
}
