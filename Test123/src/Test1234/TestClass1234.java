package Test1234;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1234 {

	public static void main(String[] args) {

		// Path of chrome driver
		// that will be local directory path passed
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// URL of the login website that is tested
		driver.get("https://www.facebook.com/");
		
		// ********login code**********
		// Enter your login email id
//		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");

		// Enter your login password
//		driver.findElement(By.id("pass")).sendKeys("xyz12345");
//		driver.findElement(By.name("login")).click();

		// *******singup code*******
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("sakshi");
		driver.findElement(By.name("lastname")).sendKeys("tyu");
		driver.findElement(By.name("reg_email__")).sendKeys("ertywq@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ertywq@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tyu");
	
		driver.findElement(By.name("birthday_day")).sendKeys("13");
		driver.findElement(By.name("birthday_month")).sendKeys("feb");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
	}
}
	
