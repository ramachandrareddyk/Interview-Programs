package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		//System.setProperty(null, null)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung galaxy s22 ultra");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
