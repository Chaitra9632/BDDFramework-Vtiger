package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Base;

public class DataDrivenTest {
	
	//Dependency injection utilized to pass the driver reference from base
	private Base base;
	public DataDrivenTest(Base base)
	{
		this.base=base;
	}
  
	@Given("Enter the URL {string}")
	public void enter_the_url(String URL) {
		
		base.driver.get(URL);
	}
	@Given("In login page enter username {string} and password {string}")
	public void in_login_page_enter_username_and_password(String username, String password) {
		
		base.driver.findElement(By.name("user_name")).sendKeys(username);
		base.driver.findElement(By.name("user_password")).sendKeys(password);
	    
	}
	@Given("click on Login Button")
	public void click_on_login_button() {
		
		base.driver.findElement(By.id("submitButton")).click();
	    
	}
	@When("Home page is displayed click on Organization link")
	public void home_page_is_displayed_click_on_organization_link() {
		
		base.driver.findElement(By.linkText("Organizations")).click();
	    
	}
	@When("Click on create organization lookm up image")
	public void click_on_create_organization_lookm_up_image() {
		
		base.driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	    
	}
	
	@When("Enter the organization name {string}")
	public void enter_the_organization_name(String OrgName) {
		
		int ran = new Random().nextInt(1000);
		base.driver.findElement(By.name("accountname")).sendKeys(OrgName+ran);
		base.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	   
	}
	@Then("Validate wheather the organization is created or not  {string}")
	public void validate_wheather_the_organization_is_created_or_not(String OrgName) {
		
		String actHeader = base.driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(actHeader.contains(OrgName));
		//base.driver.close();
	    
	}

	/*Second scenario*/
//	@When("enter organizattion name {string}")
//	public void enter_organizattion_name(String Org) {
//		
//		int ran = new Random().nextInt(1000);
//		driver.findElement(By.name("accountname")).sendKeys(Org+ran);
//	    
//	}
//	@When("From drop down select industry type as {string}")
//	public void from_drop_down_select_industry_type_as(String Indtype) {
//		
//		WebElement ele = driver.findElement(By.name("industry"));
//		Select sel = new Select(ele);
//		sel.selectByValue(Indtype);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	
//	}
//	
//
//	@Then("Validate {string} and {string} dropdown")
//	public void validate_and_dropdown(String OrgName, String IndType) {
//		
//		String actHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//		Assert.assertTrue(actHeader.contains(OrgName));
//		
//		String actInd = driver.findElement(By.xpath("//span[@id='dtlview_Industry']")).getText();
//		Assert.assertTrue(actInd.contains(IndType));
//		
//		driver.quit();
//		
//
//	}
	
//	@When("I want to read data from below table")
//	public void i_want_to_read_data_from_below_table(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	   
//		System.out.println(dataTable);
//		List<Map<String, String>> data = dataTable.asMaps();
//		
//		System.out.println(data.get(1));
//		System.out.println(data.get(0).get("country"));
//	}

}
