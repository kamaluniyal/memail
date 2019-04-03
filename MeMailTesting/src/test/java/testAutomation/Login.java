package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends BaseClass
{
	private WebElement username ;
	private WebElement password ;
	private WebElement loginButton;
	private WebElement error ;
	private WebElement loginLink ;


	public Login() throws InterruptedException {
		super();
	}

	public void login() throws InterruptedException
	{	
		System.out.println("Log in to memail");
		loginLink = driver.findElement(By.xpath("//*[@id='mainbody']/header/div[1]/div/div/div/ul[2]/li[1]/a"));
		
		loginLink.click();
		Thread.sleep(2000);

		username = driver.findElement(By.xpath("//*[@id='Username']"));
		password = driver.findElement(By.xpath("//*[@id='Password']"));
		loginButton = driver.findElement(By.xpath("//*[@id='login_form']/button"));
		error = driver.findElement(By.xpath("//*[@id='login_form']/div[3]/p"));



		//correct username wrong password
		/*
		username.sendKeys("megha");
		password.sendKeys("Megha");
		loginButton.click();
		Thread.sleep(2000);
		String actualError = (error.getText()).trim();
		if(actualError.equals("LOGIN FAILED. Check your login credentials and try again."))
		{
			System.out.println("Error message Correct");

		}
		else
		{
			System.out.println("Error message incorrect - FAIL");
			System.out.println("actual string :"+actualError);
		}

		//incorrect username correct password
		loginLink.click();
		Thread.sleep(2000);
		username.sendKeys("meg");
		password.sendKeys("Megha123#");
		loginButton.click();
		Thread.sleep(2000);
		String actualError2 = error.getText();

		if(actualError2.equals("LOGIN FAILED. Check your login credentials and try again.."))
		{
			System.out.println("Error message Correct, username is wrong");

		}
		else
		{
			System.out.println("Error message incorrect - FAIL");
			System.out.println("actual string :"+actualError2);
		}
*/
		//correct username correct password
		//loginLink.click();
		Thread.sleep(2000);
		username.sendKeys("megha");
		password.sendKeys("Megha123#");
		loginButton.click();
		Thread.sleep(5000);
	}
}

