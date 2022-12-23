package project.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class fourth extends BaseDriver{
	@Test(priority = 0)
	public void startPage() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void alerthandle() throws InterruptedException {
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

		jsAlert.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText1 = result.getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(resultText1, "You successfully clicked an alert");
		softAssert.assertAll();

		
		jsConfirm.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText2 = result.getText();
		softAssert.assertEquals(resultText2, "You clicked: Ok");
		softAssert.assertAll();
		
		jsConfirm.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String resultText3 = result.getText();
		softAssert.assertEquals(resultText3, "You clicked: Cancel");
		softAssert.assertAll();
		
		jsPrompt.click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText4 = result.getText();
		softAssert.assertEquals(resultText4, "You entered: Hello Alert");
		softAssert.assertAll();
		
		jsPrompt.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String resultText5 = result.getText();
		softAssert.assertEquals(resultText5, "You entered: null");
		softAssert.assertAll();
	}
}
