package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC3_Searchmedicinprod {
	@Test
	public void searchprod() throws InterruptedException
	{
	
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://medikart.co.in/");
    Thread.sleep(2000);
    WebElement e1= driver.findElement(By.name("s"));
    if(e1.isEnabled() || e1.isDisplayed())
    {
    e1.sendKeys("Medikart Premium Heating Back Support Cushion with 3 level settings");
    }
    else
    {
            System.out.println("Sorry");
    }

  //  e1.sendKeys("Medikart Premium Heating Back Support Cushion with 3 level settings");
  /*  e1.sendKeys(Keys.ENTER);
    
    if(e1.isEnabled() || e1.isDisplayed())
    {
    e1.sendKeys("Medikart Premium Heating Back Support Cushion with 3 level settings");
    }
    else
    {
            System.out.println("Sorry");
    }
*/
    
   /* Select s1=new Select(e1);
    s1.selectByIndex(1);
    e1.sendKeys(Keys.ENTER);*/
   
}
}