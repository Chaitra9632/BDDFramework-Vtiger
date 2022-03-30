package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {
	
	//Step 1: declaration
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement headerText;
		
		@FindBy(xpath = "//span[@id='dtlview_Industry']")
		private WebElement industryText;
		

		//Step 2: initialization
//		public OrgInfoPage(WebDriver driver)
//		{
//			PageFactory.initElements(driver, this);
//		}

		//Step 3: utilization
		public WebElement getHeaderText() {
			return headerText;
		}
		
		public WebElement getIndustryText() {
			return industryText;
		}
		
		//business library
		public String OrgNameInfo()
		{
			String OrgInfo = headerText.getText();
			return OrgInfo;
		}
		
		public String industryTypeInfo()
		{
			String indType = industryText.getText();
			return indType;
		}


}
