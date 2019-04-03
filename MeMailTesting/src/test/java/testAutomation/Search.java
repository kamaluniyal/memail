package testAutomation;

import org.openqa.selenium.By;

public class Search extends BaseClass
{
 public Search() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

public void search() throws InterruptedException
 {
	String actualSearch = driver.findElement(By.xpath("//*[@id='P01_Menu1_collapse1']/ul/li[1]/a")).getText();
	if(actualSearch.equals("SEARCH"))
	{
		System.out.println("Searh PASS");
	}
	else
	{
		System.out.println("search FAIL");
		System.out.println("actual string :"+actualSearch);
	}
	//search yourname
	driver.findElement(By.xpath("//*[@id=\'P14_username\']")).sendKeys("pratik");
	Thread.sleep(5000);
	//search domain name
	driver.findElement(By.xpath("//*[@id=\'P14_domain\']")).sendKeys("lj");
	Thread.sleep(5000);
	//add item to cart
	driver.findElement(By.xpath("//*[@id=\"searchResults\"]/ul[1]/li[1]/div[1]/button/i")).click();
	
}
}