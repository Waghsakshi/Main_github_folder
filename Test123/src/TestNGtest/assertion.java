package TestNGtest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
	

		
//		@Test
//		public void TestGoogle() throws Exception{
//			
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("HYRTutorials",Keys.ENTER);
//	    String exceptedTitle ="HYRTutorials - Google Search";
//	    String actualTitle = driver.getTitle();
//	    assertEquals(actualTitle,exceptedTitle,"Title is mismatched");
//	    driver.quit();
//		}
	
	    @Test
	    public void TestFacebook() throws Exception{
			
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.Facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("HYRTutorials",Keys.ENTER);
	    String exceptedTitle ="Facebook – log in or sign up1";
	    String actualTitle = driver.getTitle();
	    //Assert.assertNotEquals(actualTitle,exceptedTitle,"Title is mismatched");
	    Assert.assertTrue(actualTitle.equals(exceptedTitle));
	    driver.quit();
	    
	   
		

	
}
}
