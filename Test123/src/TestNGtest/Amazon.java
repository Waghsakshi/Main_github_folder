package TestNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
		// Path of chrome driver
		// that will be local directory path passed
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// URL of the login website that is tested
		driver.get("https://www.amazon.in/");
		
		
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme phone");
     driver.findElement(By.id("nav-search-submit-button")).click();
     driver.get("https://www.amazon.in/realme-narzo-Carbon-Black-Storage/dp/B09FKB3446/ref=sr_1_1?crid=EEFE3YA373Y&keywords=realme%2Bphone&qid=1675450708&sprefix=%2Caps%2C153&sr=8-1&th=1");
     driver.findElement(By.id("add-to-cart-button")).click();
}
}