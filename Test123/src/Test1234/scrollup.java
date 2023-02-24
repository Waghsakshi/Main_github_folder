package Test1234;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
	driver.manage().window().maximize();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scroll(0,1000)");
	

}
}
