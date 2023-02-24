package TestNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testngclass {
	WebDriver driver = null;
	@BeforeClass
	public void lanuchBrower()
	{
		System.out.println("Before Class");    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@BeforeMethod
	public void gotoCreatenewAccount()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
	}

	
	@Test
	public void ClickTerm()
	{

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/p/a[1]")).click();
	}
	@Test
	public void privancypolices()
	{

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/p/a[2]")).click();
		driver.getWindowHandle();
	}
	@Test
	public void cookiespolices()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/p/a[3]")).click();

	}
	@AfterMethod 
	public void Timewait()
	{
	
	}
	@AfterClass
	public void close()
	{
		System.out.println("AfterClass");
		//driver.close();
	}
}
