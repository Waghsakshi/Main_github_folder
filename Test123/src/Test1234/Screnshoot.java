package Test1234;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screnshoot {
	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f,new File("C:\\Users\\Lenovo\\Downloads\\amazonScreenshot.jpg"));
		
	}
}
	