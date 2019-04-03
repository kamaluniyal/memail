package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration extends BaseClass{
	
	
	private WebElement registrationLink ;
	private WebElement username ;
	private WebElement password ;
	private WebElement confirmPassword;
	private WebElement error ;
	private WebElement registerButton;

	

	public void registration() throws InterruptedException {

		System.out.println("Register user");
		registrationLink = driver.findElement(By.xpath("//*[@id='mainbody']/header/div[1]/div/div/div/ul[2]/li[2]/a"));
		
		registrationLink.click();
		Thread.sleep(5000);
		
		username = driver.findElement(By.xpath("//*[@id='Username']"));
		password = driver.findElement(By.xpath("//*[@id='Password']"));
		confirmPassword = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
		error = driver.findElement(By.xpath("//*[@id=\"Password-error\"]/div/p"));
		registerButton =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/button"));
		
	/*

	//in case of both id & password wrong
	//driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/ul[2]/li[2]/a")).click();
	
    username.sendKeys("testin");
	password.sendKeys("Testi");
	confirmPassword.sendKeys("");
	registerButton.click();
	Thread.sleep(2000);
	
	//to check error 
	String actualError = error.getText();
	if(actualError.equals("Please enter a valid password."))
	{
		System.out.println("Error message Correct");
	
	}
	else
	{
		System.out.println("Error message incorrect - FAIL");
		System.out.println("actual string :"+actualError);
	}
	
	//correct id correct password reenter password wrong
	registrationLink.click();
	Thread.sleep(5000);
    username.sendKeys("testing");
	password.sendKeys("Testing123#");
	confirmPassword.sendKeys("Testing");
	registerButton.click();
	Thread.sleep(2000);
	
	//check error
	String actualError2 =error.getText();
	if(actualError2.equals("Oops! The passwords don't match!."))
	{
		System.out.println("Error message Correct");
		
	}
	else
	{
		System.out.println("Error message incorrect- FAIL");
		System.out.println("actual string :"+actualError2);
	}
	
	*/
	
	//correct id, password , reenter password
	//registrationLink.click();
	Thread.sleep(5000);
    username.sendKeys("testing");
	password.sendKeys("Testing1234#");
	confirmPassword.sendKeys("Testing1234#");
	registerButton.click();
	Thread.sleep(5000);
	
}

	
} 




