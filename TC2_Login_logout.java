package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2_Login_logout {

	@Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://medikart.co.in/my-account/?action=login#");
        Thread.sleep(2000);
        
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("jiyasarode712@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("jiya@123");
        WebElement button=driver.findElement(By.name("login"));
        button.click();
        Thread.sleep(4000);
        
        Point p1=     button.getLocation();
        int x=        p1.getX();
        int y=        p1.getY();
        System.out.println(x);
        System.out.println(y);
        ChromeDriver js=        driver;
        js.executeScript("window.scrollBy(0,0)",button);
        WebElement e3=driver.findElement(By.name("login_whatsapp_phone"));
        e3.sendKeys("9209406339");
        
        WebElement button1=driver.findElement(By.xpath("//button[@id='send_login_whatsapp_otp']"));
        button1.click();
      
		
	}

	

}

