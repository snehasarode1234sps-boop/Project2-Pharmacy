package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC6_Removeitem {
	@Test
	public void removeitemfromcart() throws InterruptedException
	{
	
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://medikart.co.in/");
    Thread.sleep(2000);
    WebElement e1= driver.findElement(By.name("s"));
    e1.sendKeys("Medikart Premium Heating Back Support Cushion with 3 level settings");
    e1.sendKeys(Keys.ENTER);
    WebElement addtocart_btn1= driver.findElement(By.name("add-to-cart"));
    addtocart_btn1.click();
    Thread.sleep(2000);
    WebElement medikartimg= driver.findElement(By.cssSelector(".attachment-full.size-full[width='1250']"));
    medikartimg.click();
    Thread.sleep(2000);
    WebElement e2= driver.findElement(By.name("s"));
    e2.sendKeys("Medikart Heating Pad for Back Pain in Blue Colour");
    e2.sendKeys(Keys.ENTER);
    WebElement addtocart_btn2= driver.findElement(By.name("add-to-cart"));
    addtocart_btn2.click();
    Thread.sleep(4000);
    WebElement remove= driver.findElement(By.xpath("//a[@aria-label='Remove Medikart Premium Heating Back Support Cushion with 3 level settings from cart']"));
    remove.click();
}
}