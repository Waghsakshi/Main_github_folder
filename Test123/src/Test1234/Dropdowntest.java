package Test1234;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntest {
	public static void main(String[] args) {

		// Path of chrome driver
		// that will be local directory path passed
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Lenovo/Desktop/Listbox.html");
		//identify the element
		WebElement listbox =driver.findElement(By.id("City"));
		Select select = new Select(listbox);
		
}
}