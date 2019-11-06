package demoarchetype.DemoArcheType.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import demoarchetype.DemoArcheType.constants.ConstantFilePaths;
import demoarchetype.DemoArcheType.reports.ExtentReport;
import demoarchetype.DemoArcheType.reports.LogReports;
import demoarchetype.DemoArcheType.utils.ReadLocatorsFile;


public class TestBase extends ExtentReport
{
	LogReports log = new LogReports();
	Properties baseProperty;
	String url;
	String browser;
	String browserTypeConnection;
	
	
	@BeforeMethod
	public void initializeBrowser() throws Exception {
		
		baseProperty = ReadLocatorsFile.loadProperty(ConstantFilePaths.CONFIG_FILE);
		url = baseProperty.getProperty("url");
		browser = baseProperty.getProperty("browserType");
		browserTypeConnection=baseProperty.getProperty("connectionType");
		
		if(browserTypeConnection.equalsIgnoreCase("normal"))
		{
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ConstantFilePaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser is started...");
		} 
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", ConstantFilePaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser is started...");
		} 
		else if (browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", ConstantFilePaths.IE_FILE);
			driver = new InternetExplorerDriver();
			log.info("IE browser is started...");
		}
		}
		else if(browser.equalsIgnoreCase("gridBrowserConnection"))
		{
			GridTestBase.initializeBrowser();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
