package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC12_addremoveitemformwishlist {
       @Test
       public void wishlistitems() throws InterruptedException
    {
	  ChromeDriver driver=new ChromeDriver();
      driver.get("https://medikart.co.in/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
   
     WebElement e2=driver.findElement(By.xpath("//a[@data-product-id=\"6425\"]"));
      
      Point p2=        e2.getLocation();
      int x1=        p2.getX();
      int y1=        p2.getY();
      System.out.println(x1);
      System.out.println(y1);
      ChromeDriver js1=        driver;
      js1.executeScript("window.scrollBy(0,"+y1+")");
      
      e2.click();   
      Thread.sleep(2000);
      WebElement e3=driver.findElement(By.xpath("//a[@title=\"Wishlist products\"]"));
      Point p3=        e3.getLocation();
      int x2=        p3.getX();
      int y2=        p3.getY();
      System.out.println(x2);
      System.out.println(y2);
      ChromeDriver js2=        driver;
      js1.executeScript("window.scrollBy(0,"+(-y2)+")");
      e3.click();
}
}