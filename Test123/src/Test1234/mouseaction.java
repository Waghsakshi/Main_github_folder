package Test1234;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	Actions actions = new Actions(driver);
	WebElement main= driver.findElement(By.id("gh-ac"));
	driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=Sumsung+watch&_sacat=0hh");
	
	actions.moveToElement(main);
	try {
		Thread.sleep(6000);
		actions.click().build().perform();
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
}
}
