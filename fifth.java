package project.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fifth extends BaseDriver {
	@Test(priority = 0)
	public void startPage() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void hoverhandle() throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement auto = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement motorgear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(auto).perform();
		Thread.sleep(3000);
		action.moveToElement(motorgear).perform();
		Thread.sleep(3000);
		helmet.click();
		Thread.sleep(2000);
	}
}
