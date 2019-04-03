package testAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends BaseClass{
	
	@Test
	public void login_WrongPassword() throws InterruptedException{
	
		driver.findElement(By.xpath("//*[@id=\"mainbody\"]/header/div[1]/div/div/div/ul[2]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Username\']")).sendKeys("megha");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Megha");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/button")).click();
		Thread.sleep(2000);
		String actualError = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/p")).getText();
		if(actualError.equals("LOGIN FAILED. Check your login credentials and try again."))
		{
			System.out.println("Error message Correct");
			
		}
		else
		{
			System.out.println("Error message incorrect - FAIL");
			System.out.println("actual string :"+actualError);
		}
	}
	

	@Test
	public void login_correctCredentials() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/ul[2]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Username\']")).sendKeys("megha");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Megha123#");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/button")).click();
		Thread.sleep(2000);
	}
	
	
	public LoginTests() throws InterruptedException {
		super();
		
	}

}
