package Seleniumproject2_Pharmacyhealthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC7_Checkoutprocess {
	
        @Test
		public void checkout() throws InterruptedException
		{
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://medikart.co.in/");
	    Thread.sleep(2000);
	    driver.get("https://medikart.co.in/my-account/?action=login#");
        Thread.sleep(2000);
        
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("jiyasarode712@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("jiya@123");
        WebElement button=driver.findElement(By.name("login"));
        button.click();
	    WebElement e1= driver.findElement(By.name("s"));
	    e1.sendKeys("Medikart Premium Heating Back Support Cushion with 3 level settings");
	    e1.sendKeys(Keys.ENTER);
	    WebElement addtocart_btn= driver.findElement(By.name("add-to-cart"));
	    addtocart_btn.click();
	    WebElement checkoutbtn1=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
	    checkoutbtn1.click();
	    WebElement firstname=driver.findElement(By.id("billing_first_name"));
	    firstname.sendKeys("Jiya");
	    WebElement lastname=driver.findElement(By.id("billing_last_name"));
	    lastname.sendKeys("Sarode");
	    WebElement Streetaddress=driver.findElement(By.id("billing_address_1"));
	    Streetaddress.sendKeys("House no.2,Ganesh Residency");
	    WebElement town=driver.findElement(By.id("billing_city"));
	    town.sendKeys("pune");
	    Thread.sleep(2000);
	    WebElement state=driver.findElement(By.xpath("//span[@id='select2-billing_state-container']"));
	    state.click();
	    WebElement statedropdown=driver.findElement(By.xpath("/html[1]/body[1]/span[2]/span[1]/span[1]/input[1]"));
	    statedropdown.sendKeys("Maharashtra");
	    statedropdown.sendKeys(Keys.ENTER);
	    WebElement pincode=driver.findElement(By.id("billing_postcode"));
	    pincode.sendKeys("100250");
	    WebElement phone=driver.findElement(By.id("billing_phone"));
	    phone.sendKeys("9099925000");
	    WebElement email=driver.findElement(By.name("billing_email"));
		email.sendKeys("jiyasarode712@gmail.com");
		Thread.sleep(2000);
		 Point p1=     email.getLocation();
	        int x=        p1.getX();
	        int y=        p1.getY();
	        System.out.println(x);
	        System.out.println(y);
	        ChromeDriver js=        driver;
	        js.executeScript("window.scrollBy(0,300)",email);
	        WebElement chkbox1=driver.findElement(By.id("payment_method_cod_partialcod_rf"));
	        chkbox1.click();
	        Thread.sleep(2000);
	        WebElement chkbox2=driver.findElement(By.id("terms"));
	        chkbox2.click();
	        WebElement orderplacebtn=driver.findElement(By.id("place_order"));
	        orderplacebtn.click();
		}
        
   
        
        
        
}