package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC9_filterproduct {

	@Test
	public void filterprod() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://medikart.co.in/");
	    Thread.sleep(2000);
	    WebElement e1= driver.findElement(By.name("s"));
	    e1.sendKeys("Ventilators");
	    e1.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


