package project.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class third extends BaseDriver{
	@Test(priority = 0)
	public void startPage() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void formexam() throws InterruptedException {
		WebElement gender = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement day1 = driver.findElement(By.xpath("//input[@id='tuesday']"));
		WebElement day2 = driver.findElement(By.xpath("//input[@id='friday']"));

		gender.click();
		Thread.sleep(2000);
		day1.click();
		Thread.sleep(2000);
		day2.click();
		Thread.sleep(2000);
		
	}
}
