import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CC1_1 {
	WebDriver driver;
  @Test
  public void print() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  String url1="https://www.saucedemo.com/";
	  driver.get(url1);
	  String title=driver.getTitle();
	  Assert.assertEquals("Swag Labs", title);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce",Keys.ENTER);
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("	//*[@id=\"shopping_cart_container\"]/a")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	  String u=driver.getCurrentUrl();
	  Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", u);
	  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("standard");
	  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("user");
	  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();	
	  String ur=driver.getCurrentUrl();
	  Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", ur);
  }
}
