package project.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class second extends BaseDriver {
	@Test(priority = 0)
	public void startPage() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void selectmethod() throws InterruptedException {
		WebElement travel = driver.findElement(By.className("custom-select"));
		Select select = new Select(travel);
		select.selectByVisibleText("Norway");
		Thread.sleep(2000);
	}
}
