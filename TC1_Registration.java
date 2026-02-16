package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Registration {
        @Test
        public void register() throws InterruptedException
        {
	    
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://medikart.co.in/");
        Thread.sleep(2000);
        WebElement e1=driver.findElement(By.className("wd-tools-inner"));
       
        Point p1=     e1.getLocation();
        int x=        p1.getX();
        int y=        p1.getY();
        System.out.println(x);
        System.out.println(y);
        ChromeDriver js=        driver;
        js.executeScript("window.scrollBy(0,150)",e1);
        e1.click();
        WebElement e2=driver.findElement(By.xpath("/html/body/div[5]/div[3]/a"));
        e2.click();
        WebElement e3=driver.findElement(By.name("whatsapp_phone"));
        e3.sendKeys("9209406339");
        Point p2=     e3.getLocation();
        int x1=        p1.getX();
        int y1=        p1.getY();
        System.out.println(x);
        System.out.println(y);
        ChromeDriver js1=        driver;
        js.executeScript("window.scrollBy(0,0)",e3);
        WebElement button=driver.findElement(By.xpath("//button[@id='send_whatsapp_otp']"));
        button.click();
        Thread.sleep(30000);
        WebElement e4=driver.findElement(By.name("email"));
        e4.sendKeys("jiyasarode712@gmail.com");
        WebElement register=driver.findElement(By.name("register"));       
        register.click();
        }
        
	}


