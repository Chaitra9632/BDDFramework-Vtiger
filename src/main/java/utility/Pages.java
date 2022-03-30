package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactory.CreateNewOrgPage;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.OrgInfoPage;
import pageFactory.OrganizationPage;

/**
 * To load all the pages in POM class as we cannot create same object multiple times
 * for every step definition
 * @author Chaitra M
 *
 */
public class Pages {
	
	//declare all the pom class globally and make it as static
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static OrganizationPage organizationPage;
	public static CreateNewOrgPage createNewOrgPage;
	public static OrgInfoPage orgInfoPage;
	
	//initialise it to the driver here instead of creating a constructor in POM
	public static void loadPages(WebDriver driver)
	{
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		organizationPage=PageFactory.initElements(driver, OrganizationPage.class);
		createNewOrgPage=PageFactory.initElements(driver, CreateNewOrgPage.class);
		orgInfoPage=PageFactory.initElements(driver, OrgInfoPage.class);
		
	}
	
	
	

}
