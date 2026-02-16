package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC10_Sortingofprod {


		@Test
		public void Sortingofprod() throws InterruptedException
		{
			ChromeDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://medikart.co.in/");
		    Thread.sleep(2000);
		    WebElement e1= driver.findElement(By.name("s"));
		    e1.sendKeys("Ventilators");
		    e1.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		    WebElement filter= driver.findElement(By.xpath("//select[@name='orderby']"));
		    filter.click();
		    Thread.sleep(2000);
		    Select s=new Select(filter);
		    filter.sendKeys(Keys.ARROW_DOWN);
		    filter.sendKeys(Keys.ARROW_DOWN);
		    filter.sendKeys(Keys.ARROW_DOWN);
		    filter.sendKeys(Keys.ARROW_DOWN);
		    s.selectByIndex(4);
		    filter.sendKeys(Keys.ENTER);
	}

}
