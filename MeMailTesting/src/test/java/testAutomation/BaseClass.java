package testAutomation;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {
	
	protected WebDriver driver;
	
	BaseClass(){
		System.out.println("Initilizing Tests");
		System.out.println("Setting up Browser");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();		
	}
	
	
	public void startTest() throws InterruptedException
	{
		
	
		System.out.println("Navigating to memail");
		System.out.println("Opening https://memail.azurewebsites.net ");
		driver.get("https://memail.azurewebsites.net");
		Thread.sleep(5000);
		driver.manage().window().maximize();		
				
		System.out.println("Sign in to azure");
		driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("Pratiksha.naithani@wikaad.com");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("app7pk@$3%");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(5000);

		System.out.println("Checkign memail Title");
		String expectedTitle = "MeMail | email with personality";
		String actualTitle;
		
		actualTitle= driver.getTitle();		
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title does not matches");
			System.out.println("actual title :"+actualTitle);
		}
	}
	
	public void endTest(){
		System.out.println("End test quiting browser session....");
		driver.quit();
	}
}


