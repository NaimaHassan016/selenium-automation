package project.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class first extends BaseDriver {
	@Test(priority = 0)
	public void startPage() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void examform() throws InterruptedException {
		WebElement userName = driver.findElement(By.xpath("//input[@id='name']")); 
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='phone']")); 
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']")); 
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@name='submit']"));
		
		userName.sendKeys("Test");
		Thread.sleep(2000);
		mobileNumber.sendKeys("123456789");
		Thread.sleep(2000);
		emailAddress.sendKeys("Test@yahoo.com");
		Thread.sleep(2000);
		password.sendKeys("Automate123");
		Thread.sleep(2000);
		address.sendKeys("Bashundhara Dhaka");
		Thread.sleep(2000);
		submitButton.click();
		Thread.sleep(2000);
	}
}
