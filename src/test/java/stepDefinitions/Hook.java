package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Base;
import utility.Pages;
import utility.PropertyFileUtility;
import utility.WebDriverUtility;

public class Hook extends WebDriverUtility{
	
	//Dependency injection utilized to pass the driver reference from base
	private Base base;
	
	public Hook(Base base) {
		this.base=base;
	}
	
	
	@Before//(order = 1)
	public void beforeScenario() throws IOException
	{
		//System.out.println("inside second @Before ");
		String browser = PropertyFileUtility.getPropertyValue("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			base.driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			base.driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Load all the pages of POM and initialise with the driver reference
		Pages.loadPages(base.driver);
	}

	
	//order execution will be descending order for @After +ve 0 -ve
	@After//(order = 1)
	public void afterScenario(Scenario scenario) throws Throwable
	{
		if(scenario.isFailed())
		{
			/*To attach screenshot to report we have to capture it in byte format only refer below code for that*/
			
			//take screenshot
		    TakesScreenshot ts =(TakesScreenshot) base.driver;
		    //handle in byte format
		    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		    //attach the screenshot to cucumber report
		    scenario.attach(screenshot, "image/png", scenario.getName()); 
		
			/*This will store the screenshot in folder called from Webdriver utility but in file format we cannot attach it to report*/
			getScreenShot(base.driver, scenario.getName());
			
			
		}
		base.driver.close();
		//System.out.println("inside first @After ");
	}
	

}
