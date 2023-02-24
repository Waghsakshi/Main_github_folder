package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	public static WebDriver openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");					
    WebDriver driver= new ChromeDriver();
    return driver ;
	}
    
      public static WebDriver openFirefoxBrowser() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");					
      WebDriver driver= new ChromeDriver();
      return driver;
    }

        public static WebDriver openMiceosoftEdgesBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");					
        WebDriver driver= new ChromeDriver();
        return driver;


}
}
