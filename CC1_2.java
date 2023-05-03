import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1_2 {
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }

	  @Test
	  public void Test1() throws InterruptedException {
	 String url="https://www.saucedemo.com/";
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 System.out.println("opened");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
	WebElement a=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	String o1=a.getText();
	System.out.println(o1);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
	WebElement b=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	String o2=b.getText();
	System.out.println(o2);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	WebElement c=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	String o3=c.getText();
	System.out.println(o3);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
	WebElement d=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	String o4=d.getText();
	System.out.println(o4);


	  }
	 
	  @AfterTest
	  public void afterTest() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.quit();
	  }
}