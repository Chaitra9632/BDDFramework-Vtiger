package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Base;
import utility.PropertyFileUtility;

public class Hook {
	
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
	}

	
	//order execution will be descending order for @After +ve 0 -ve
	@After//(order = 1)
	public void afterScenario()
	{
		base.driver.close();
		//System.out.println("inside first @After ");
	}
	

}
