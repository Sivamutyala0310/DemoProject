package demoarchetype.DemoArcheType.waits;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import demoarchetype.DemoArcheType.pageactions.PageActions;



	public class Waits {
		
		static WebElement element;

		public static void explicitWaitClick(WebDriver driver,String xpath) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 70);                                        // explicit wait and click()
			 element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));    
			PageActions.performActionEnter(driver);
		}

		public  static void explicitWait(WebDriver driver,String xpath) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 70);                                         // explicit wait 
			 element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}

		

}
