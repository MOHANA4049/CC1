
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1_1 {
	WebDriver driver;

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String product = "Sauce Labs Backpack";
        
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("ABCD");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("X");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        
        System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        
    } 
}