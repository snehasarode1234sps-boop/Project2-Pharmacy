package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC13_updateprofile {
	@Test
	public void updateprofile() throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://medikart.co.in/my-account/?action=login#");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    WebElement e3=driver.findElement(By.name("login_whatsapp_phone"));
    e3.sendKeys("9209406339");
    Point p2=      e3.getLocation();
    int x1=        p2.getX();
    int y1=        p2.getY();
    System.out.println(x1);
    System.out.println(y1);
    ChromeDriver js1=        driver;
    js1.executeScript("window.scrollBy(0,"+y1+")");
    e3.click();
    Thread.sleep(2000);
    WebElement button1=driver.findElement(By.xpath("//button[@id='send_login_whatsapp_otp']"));
    button1.click();
    
  }
}